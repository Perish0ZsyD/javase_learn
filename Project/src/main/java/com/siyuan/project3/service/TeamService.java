package com.siyuan.project3.service;

import com.siyuan.project3.domain.Architect;
import com.siyuan.project3.domain.Designer;
import com.siyuan.project3.domain.Employee;
import com.siyuan.project3.domain.Programmer;

/**
 * @author Siyuan
 * @Date 2024/10/18 16:30
 */
public class TeamService {
    private static int counter = 1; // 给member赋值使用
    private final int MAX_MEMBER = 5; // 限制开发团队的人数
    private Programmer[] team = new Programmer[MAX_MEMBER]; // 保存开发团队成员
    private int total; // 记录开发团队中实际的人数

    public TeamService() {
    }

    /**
     * 获取开发团队中的所有成员
     * @return
     */
    public Programmer[] getTeam() {
        Programmer[] team = new Programmer[total];
        System.arraycopy(this.team, 0, team, 0, total);
        return team;
    }

    /**
     * 将指定员工添加到开发团队中
     * @param e
     */
    public void addMember(Employee e) throws TeamException {
        // 成员已满，无法添加
        if (total >= MAX_MEMBER) {
            throw new TeamException("成员已满，无法添加");
        }
        // 该成员不是开发人员，无法添加
        if (!(e instanceof Programmer)) {
            throw new TeamException("该成员不是开发人员，无法添加");
        }

        Programmer p = (Programmer) e;
        switch (p.getStatus()) {
            case BUSY:
                throw new TeamException("该员工已是某团队成员");
            case VOCATION:
                throw new TeamException("该员工正在休假，无法添加");
        }

        if (isExist(p)) {
            throw new TeamException("该员工已在本开发团队中");
        }

        int numOfArch = 0, numOfDes = 0, numOfPro = 0;
        for (int i = 0; i < total; i++) {
            if (team[i] instanceof Architect) {
                numOfArch++;
            } else if (team[i] instanceof Designer) {
                numOfDes++;
            } else if (team[i] instanceof Programmer) {
                numOfPro++;
            }
        }

        if (p instanceof Architect) {
            if (numOfArch >= 1) {
                throw new TeamException("团队中至多只能有一名架构师");
            }
        } else if (p instanceof Designer) {
            if (numOfDes >= 2) {
                throw new TeamException("团队中至多只能有两名设计师");
            }
        } else if (p instanceof Programmer) {
            if (numOfPro >= 3) {
                throw new TeamException("团队中至多只能有三名程序员");
            }
        }
        p.setStatus(Status.BUSY);
        p.setMemberId(counter++);
        team[total++] = p;
    }

    private boolean isExist(Programmer p) {
        for (int i = 0; i < total; i++) {
            if (team[i].getId() == p.getId()) {
                return true;
            }
        }
        return false;
    }

    public void removeMember(int memberId) throws TeamException {
        int i = 0;
        for (; i < total; i++) {
            if (team[i].getMemberId() == memberId) {
                team[i].setStatus(Status.FREE);
                break;
            }
        }
        if (i == total) {
            throw new TeamException("找不到指定memberId的员工，删除失败");
        }
        System.arraycopy(team, i + 1, team, i, total - i - 1);
        team[--total] = null;
    }
}
