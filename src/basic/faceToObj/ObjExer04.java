package basic.faceToObj;

/**
 * @Description TODO
 * @ClassName ObjExer04
 * @Author 钟宇豪
 * @Date 2022/1/27 17:08
 * @Version 1.0
 */
/*
定义类Student，学号number(int)，年级state(int)，成绩score(int)，
创建20个学生，学号为1到20，年级和成绩由随机数确定
打印出三年级的学生信息
用冒泡排序按学生成绩排序，并遍历所有学生信息
 */
public class ObjExer04 {
    public static void main(String[] args) {
        Student[] stu = new Student[20];
        for (int i = 0; i < stu.length; i++) {
            stu[i] = new Student();
            stu[i].number = i + 1;
            stu[i].state = (int) (Math.random() * 6);
            stu[i].score = (int) (Math.random() * 100);
        }

        for (int i = 0; i < stu.length; i++) {
            if (stu[i].state == 3) {
                System.out.println(stu[i].number + "\t" + stu[i].state + "\t" + stu[i].score);
            }
        }

        for(int i=0;i<stu.length-1;i++){
            for(int j=0;j<stu.length-1-i;j++){
                if(stu[j].score>stu[j+1].score){
                    Student temp=stu[j];
                    stu[j]=stu[j+1];
                    stu[j+1]=temp;
                }
            }
        }
        for(int i=0;i<stu.length;i++){
            System.out.println(stu[i].number + "\t" + stu[i].state + "\t" + stu[i].score);
        }
    }
}

class Student {

    int number; //学号
    int state; //年级
    int score; //成绩

}
