package test.MyCase;

public class JavaTiger {
    int age;      // ����
    int hight;    // ����߶�

    public JavaTiger() {
        print();
        this.age=2;   //�����ʼ�� age ��ֵ �����ݹ鷵�ص�ʱ�����ֵ�ᱻ��д
    }
    
    public JavaTiger(int age) {
//        this();      // �����Լ��ĵ�һ�����캯��������������������ִ�е�
        this.age = age;
        print();
    }

    public JavaTiger(int age, int hight) {
//        this(age);   // �����Լ��ڶ������캯��  ������������������ִ�е�
        this.hight = hight;
        print();
    }

    public void print() {  //��ӡ����
        System.out.println("I'am a " + age + "�� " + hight + "�߸� tiger!");
    }
    public static void main(String[] args) {
//        new JavaTiger(3,3);
    }
}