package Car.rental;

        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.Scanner;
        import java.io.BufferedReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        //初始化租车信息
        Car[] Allcar= {
                new Coach("小轿车",40,4),
                new Coach("面包车",65,7),
                new Coach("大巴车",180,20),
                new Truck("低栏车",30,1.5),
                new Truck("高栏车",47,2.5),
                new Truck("厢式车",80,4.5),
                new Pickup("日式皮卡车",60,5,1),
                new Pickup("美式皮卡车",60,5,3)
        };

        //输入提示语
        System.out.println("是否要租车：（y/n）");
        //输入
        Scanner scan=new Scanner(System.in);
        //输入判断
        String input=scan.next();
        if(input.equals("y"))
        {
            int all_rent = 0;//总租金
            int all_passenger=0;//总载客
            double all_volume=0.0;//总载货
            int all_day = 0;//租车天数
            int all_sum = 0;//租车总数量
            int[] single_sum = new int[8];
            System.out.println("租车信息数据");
            System.out.println("序号\t汽车名称\t租车费用（元/（车▪天））\t最大载人（人）\t\t最大载货（吨）");
            for(int i=0;i<Allcar.length;i++)//按顺序输出各各车量信息
            {
                if(Allcar[i] instanceof Truck)//判断Allcar[i]引用的类型变量是否为Truck类,若是则提取对应信息并显示
                {
                    System.out.println((i+1)+"\t"+Allcar[i].getName()+"\t\t\t"+Allcar[i].getRent()+"\t\t\t\t\t\t\t\t"+Allcar[i].getVolume());
                }
                if(Allcar[i] instanceof Coach)//同上
                {
                    System.out.println((i+1)+"\t"+Allcar[i].getName()+"\t\t\t"+Allcar[i].getRent()+"\t\t\t\t\t"+Allcar[i].getPassenger());
                }
                if(Allcar[i] instanceof Pickup)//同上
                {
                    System.out.println((i+1)+"\t"+Allcar[i].getName()+"\t\t"+Allcar[i].getRent()+"\t\t\t\t\t"+Allcar[i].getPassenger()+"\t\t\t"+Allcar[i].getVolume());
                }
            }
            int finish = 0;//为1时输入标志输入完成
            int i = 0;//调控当前设置的是几号车
            while (finish!=1) {//当输入不是大于零的数时重复输入
                System.out.println("请输入序号"+(i+1)+"("+Allcar[i].getName()+")的租用数量：");
                single_sum[i] = scan.nextInt();
                if (single_sum[i]<0){
                    System.out.println("请输入有效数值！");
                    continue;
                }
                if (single_sum[i]>0)
                {
                    all_sum+=single_sum[i];//总的车数量
                    if(Allcar[i] instanceof Truck)//判断Allcar[i]引用的类型变量是否为Truck类,若是则对相关数据进行统计
                    {
                        all_rent+=(Allcar[i].getRent()*single_sum[i]);//统计总租金
                        all_volume+=(Allcar[i].getVolume()*single_sum[i]);//统计总载货量
                    }
                    if(Allcar[i] instanceof Coach)//同上
                    {
                        all_rent+=(Allcar[i].getRent()*single_sum[i]);
                        all_passenger+=(Allcar[i].getPassenger()*single_sum[i]);//统计总载客量
                    }
                    if(Allcar[i] instanceof Pickup)//同上
                    {
                        all_rent+=(Allcar[i].getRent()*single_sum[i]);
                        all_passenger+=(Allcar[i].getPassenger()*single_sum[i]);
                        all_volume+=(Allcar[i].getVolume()*single_sum[i]);
                    }
                    i++;//输入不为0且已完成统计
                }
                else
                    i++;//当输入为0时
                if (i == 8) {
                    while (finish!=1) {//当输入天数为无效数值或租车天数需要重新设置时循环
                        System.out.println("请输入您要租车的天数");//输入提示
                        all_day = scan.nextInt();
                        if (all_day < 0) {
                            System.out.println("请输入有效数值！");
                            continue;
                        }
                        System.out.println("是否确定租车天数为："+all_day+" （y/n）");
                        input=scan.next();
                        if(input.equals("n"))
                            continue;
                        all_rent = all_rent * all_day;
                        finish = 1;
                    }
                }
            }
            System.out.println("您的总载客为："+all_passenger);
            System.out.println("您的总载货为:"+all_volume);
            System.out.println("您的总租金为："+all_rent);
            System.out.println("您选择的租车天数为:"+all_day);
            System.out.println("您所租的车辆总数："+all_sum);
            System.out.println("各车数量明细：");
            for(i=0;i<8;i++){
                System.out.println((single_sum[i]!=0)?(""+Allcar[i].getName()+" 数量："+single_sum[i]):('\0'));//判断是否有租车，若租则显示，若不租则返回空
            }

        }
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        str = bf.readLine();
        if (str.length() == 0) {//回车不计入字符，所以当字符串大小未发生变化时即为回车
            System.exit(0);
        }
    }

}