import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//        int n = 100;
//        int sum = (n + 1) * n / 2;
//        System.out.println(sum);
//        System.out.println(sum == 5050 ? "����ͨ��" : "����ʧ��");
/*
    ����������
 */
//     double a = 1.0;
//     double b = 3f;
//     double c = -4f;
//     //  Math.sqrt(); ƽ����
//     double r1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
//     double r2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
//     System.out.println(r1);
//     System.out.println(r2);
//     System.out.println(r1 == 1 && r2 == -4 ? "����ͨ��" : "����ʧ��");

//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
/*
    ��������
*/
//        int age = 7;
//        boolean isPrimaryStudent = age >= 6 && age <= 12 ? true : false;
//        System.out.println(isPrimaryStudent ? "Yes" : "No");
/*
    �ַ����ַ���
    char Unicode��ʾ�ַ���ռ�������ֽڡ� ʹ��''

    String����������(���ɱ��ԣ��ַ������ݲ��ɱ䣬���Ǳ���ָ��ɱ䡪������CPPָ��)����"..."��ʾ�ַ�����ת���ַ�\
    Stringָ��null�Ϳ�ֵ""��һ�������ַ�����һ����Ч���ַ������󣬲�����null
    \n ����  \r �س�  \t ��ʾtab   \ u####��ʾһ��Unicode����(�ո�ȥ��)

    �ַ������� +

    JAVA13��ʼ """..."""��ʾ�����ַ����������ݿ�SELECT���
    """
    SELECT * FROM
        users
    WHERE id > 100
    ORDER BY name DESC
    """
    ע���������У�DESC����һ��\n���з�������������ôд-> ORDER BY name DESC"


 */
    //  ���String�Ĳ��ɱ��Ժ�ָ������
//        String s = "hello";
//        String t = s;
//        s = "world";
//        System.out.println(t);  //  hello
//        System.out.println(s);  //  world

        /*
            �������ͣ��������͡�������CPPָ�룬�ı�ָ�򲻻�ı�ԭ�������ݣ�����Խ������ʱ�ᱨ��
            int[] array = new int[5];  //  ����ֱ�ӳ�ʼ��Ԫ�أ����������Զ��Ƶ������С��
            Java��������Ԫ�ػ��ʼ��ΪĬ��ֵ��0 0.0 false;����һ����������С���ɱ�
            array.length  // ��ȡ���鳤��
            ����Ԫ�����������ͣ���String���޸�������Ǹı���ָ��ԭ����String�ַ����޷���ͨ�������±�������ȡ
         */
//        String[] name = {"ABC", "XYZ", "ZOO"};
//        String s = name[1];
//        name[1] = "CAT";
//        System.out.println(s);  //  XYZ
        /*
        println��ӡ���������
        print��ӡ���
        printf��ʽ�������ռλ��%?  like %.2f��
        ��ʽ�������鷳
         */
//        Scanner scanner = new Scanner(System.in);  // ����Scanner����
//        System.out.println("Input your name: ");  // ��ӡ��ʾ
//        String name = scanner.nextLine();  // ��ȡһ�����벢��ȡ�ַ���
//        System.out.print("Input your age: ");
//        int age = scanner.nextInt();  // ��ȡһ�����벢��ȡ����
//        System.out.printf("Hi, %s, your are %d years old!", name, age);  // ��ʽ�����
        /*
            �ж������������
            �ж�ֵ�����Ƿ���ȿ���ʹ��==������������ж��������͵ı����Ƿ���ȣ�== ��ʾ�������Ƿ���ȡ����������Ƿ�ָ��ͬһ������������ͬ����ָ��һ������false��
            equals()�����ж��������͵ı��������Ƿ���ȣ�������ָ����ȣ�
            ����Ϊ�յ�ʱ��ʹ��equals�ᱨNullPointerException��Ϊ�˱������ʹ�� && ������Ķ�·���� s1 != null && s1.equals("Hello")

            ����Arrays.sort()������Ԫ��Ϊ�������͵������������󣬸ı����ָ��Ԫ�����ڴ��е�λ��û��
         */
//        int sum = 0;
//        int n = 0;
//        while (n < 100) {
//            n++;
//            sum = sum + n;
//        }
//        System.out.println(sum);
        //  ע�ⱨ������Ϊ������Ĭ�ϱ�����UTF-8�����뱣���ʽ��GBK���޸�һ�¾��У�cmd�鿴chcp���936->��ʾGBK���룩
        for (String arg : args) {
            if ("-version".equals(arg)) {
                System.out.println("v 1.0");
                break;
            }
        }
    }
}