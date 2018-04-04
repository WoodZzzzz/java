package j2se.classloader;
public class StaticTest {
    /**��һ������*/
    public static int k = 0;
    /**�ڶ������أ���Ϊ��newһ��ʵ����
     * ���ȳ�ʼ��j ��ӡ��  1:j i=0 n=0
     * ִ�й����     ��ӡ��  2:����� i=1 n=1
     * ִ�й��췽�� ��ӡ��  3:t1 i=2 n=2
     * ʵ�������
     */
    public static StaticTest t1 = new StaticTest("t1");
    /**���������� ����ͬ��
     * ���ȳ�ʼ��j ��ӡ��  4:j i=3 n=3
     * ִ�й����     ��ӡ��  5:����� i=4 n=4
     * ִ�й��췽�� ��ӡ��  6:t2 i=5 n=5
     */
    public static StaticTest t2 = new StaticTest("t2");
    /**���ĸ�����
     * ��ӡ��  7:i i=6 n=6
     */
    public static int i = print("i");
    /**
     * ���������
     */
    public static int n = 99;
    /**
     * �˱���������ص�ʱ�򲢲���ʼ������ʵ�������ʱ���ʼ��
     */
    public int j = print("j");
     
    {
        print("�����");
    }
    /**
     * ���������� ��ʱ��n�Ѿ�����ʼ��  ���Դ�ӡ��
     * 8:��̬�� i=7 n=99
     */
    static{
        print("��̬��");
    }
    //-----------�������������---------------------
    /**
     * ʵ�������̣�
     *         ���ȼ��طǾ�̬��������
     *         ��ʼ���Ǿ�̬������9:j i=8 n=100
     *         ִ�й���飺10:����� i=9 n=101
     *         ִ�й��췽��:11:init i=10 n=102
     * ʵ�������
     */
    
    /**
     * ִ�й��캯��  ʵ�������
     * @param str
     */
    public StaticTest(String str) {
        System.out.println((++k) + ":" + str + " i=" + i + " n=" + n);
        ++n;
        ++i;
    }
    /**
     * ���Ӧ�������ȼ��� ���ǣ����ز�����ִ��
     * ��Ϊ��������ش˺�������̬�������޷���ʼ����
     * @param str
     * @return
     */
    public static int print(String str) {
        System.out.println((++k) + ":" + str + " i=" + i + " n=" + n);
        ++i;
        return ++n;
    }
    
    public static void main(String[] args) {
        /**���ȼ����࣬Ȼ��ʵ������
         * ����ع��̣�
         *         ���ȼ������еľ�̬����������ִ�У�
         *         Ȼ���վ�̬������˳��ʼ��ʼ��
         *         ��̬������ʼ����Ϻ�ִ�о�̬����飨��ִ�й���飩
         *         ��ʱ��������
         * ʵ�������̣�
         *         ���طǾ�̬����
         *         ��ʼ���Ǿ�̬����
         *         ִ�й�������
         *         ִ�й��캯��
         *         ��ʱʵ�������
         */
        StaticTest t = new StaticTest("init");
    }
 
}