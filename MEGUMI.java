import java.lang.String;
import java.util.ArrayList;
import java.util.*;
/**
 * Created by Administrator on 2016/10/13 0013.
 */
public class MEGUMI {
    public static void main(String[] args) {
        String one[] = new String[]{"黑桃", "方块", "红星", "梅花"};
        int two[] = new int[]{2,3,4,5,6,7,8,9,10,11,12,13,14};
        ArrayList pic = new  ArrayList();
        ArrayList num = new  ArrayList();
        ArrayList num11=new ArrayList();
        ArrayList num22=new ArrayList();

        for (int i=1;i<=13;i++)
        {   for (int q=0;q<=3;q++)
             {pic.add(one[q]);}
        }
        for (int i=1;i<=4;i++)
        {
           for (int q=0;q<=12;q++)
              {num.add(two[q]);}
        }

        int a=52;
        Random random=new Random();
        System.out.println("公共牌为:");
        int num1[]=new int[7];
        int num2[]=new int[7];
        String pic1[]=new String[7];
        String pic2[]=new String[7];

        for (int i=0;a>47;a--,i++) {
            int change = random.nextInt(a) % (a + 1) + 0;
            {
                if ((int) num.get(change)==11)
                System.out.println((String) pic.get(change) + " J");
                else if ((int) num.get(change)==12)
                System.out.println((String) pic.get(change) + " Q");
                else if ((int) num.get(change)==13)
                System.out.println((String) pic.get(change) + " K");
                else if ((int) num.get(change)==14)
                System.out.println((String) pic.get(change) + " A");
                else
                System.out.println((String) pic.get(change) + " " + (int) num.get(change));
            }


            num1[i]=(int) num.get(change);
            num2[i]=(int) num.get(change);
            pic1[i]=(String) pic.get(change);
            pic2[i]=(String) pic.get(change);
            pic.remove(change);
            num.remove(change);
        }
        for (int b=5;a>45;a--,b++)
        {
            int change= random.nextInt(a)%(a+1)+0;
            num1[b]=(int) num.get(change);
            pic1[b]=(String) pic.get(change);
            pic.remove(change);
            num.remove(change);
        }
        for (int b=5;a>43;a--,b++)
        {
            int change= random.nextInt(a)%(a+1)+0;
            num2[b]=(int) num.get(change);
            pic2[b]=(String) pic.get(change);
            pic.remove(change);
            num.remove(change);
        }
        System.out.println("玩家1底牌为:");
        { if (num1[5]==11)
        System.out.println(pic1[5]+" J");
        else if (num1[5]==12)
            System.out.println(pic1[5]+" Q");
        else if (num1[5]==13)
            System.out.println(pic1[5]+" K");
        else if (num1[5]==14)
            System.out.println(pic1[5]+" A");
        else
        System.out.println(pic1[5]+" "+num1[5]);}

        { if (num1[6]==11)
            System.out.println(pic1[6]+" J");
        else if (num1[6]==12)
            System.out.println(pic1[6]+" Q");
        else if (num1[6]==13)
            System.out.println(pic1[6]+" K");
        else if (num1[6]==14)
            System.out.println(pic1[6]+" A");
        else
            System.out.println(pic1[6]+""+num1[6]);}

        System.out.println("玩家2底牌为:");
        { if (num2[5]==11)
            System.out.println(pic2[5]+" J");
        else if (num2[5]==12)
            System.out.println(pic2[5]+" Q");
        else if (num2[5]==13)
            System.out.println(pic2[5]+" K");
        else if (num2[5]==14)
            System.out.println(pic2[5]+" A");
        else
            System.out.println(pic2[5]+" "+num2[5]);}

        { if (num2[6]==11)
            System.out.println(pic2[6]+" J");
        else if (num2[6]==12)
            System.out.println(pic2[6]+" Q");
        else if (num2[6]==13)
            System.out.println(pic2[6]+" K");
        else if (num2[6]==14)
            System.out.println(pic2[6]+" A");
        else
            System.out.println(pic2[6]+" "+num2[6]);}









        Arrays.sort(num1);
        Arrays.sort(num2);

         int score1=0,score2=0,score=0;
         int judge1[]=new int[5];
         int judge2[]=new int[5];
       for(int i=0;i<=2;i++)//判断玩家1的分数
       {   int answer1[]=new int[5];//选5张
           String answer11[]=new String[5];
           for (int q=i,j=0;q<=i+4;q++,j++)
           {   answer1[j]=num1[q];
               answer11[j]=pic1[q];
           }
           if (answer11[1]==answer11[2]&&answer11[1]==answer11[3]&&answer11[1]==answer11[4]&&answer11[1]==answer11[0])//如果同花则获得39分
           {
               {
                   score += 39;
               }
               if (answer1[0] == answer1[1] + 1 && answer1[1] == answer1[1] + 1 && answer1[2] == answer1[1] + 1 && answer1[3] == answer1[1] + 1)//判断顺子
               {
                   score += 31;//顺子加31分
                   if (answer1[4] == 14)//皇家顺额外加10分
                   {
                       score += 10;
                   }
               }
           }
           else //如果不是同花
           {
               if (answer1[0] == answer1[1] + 1 && answer1[1] == answer1[1] + 1 && answer1[2] == answer1[1] + 1 && answer1[3] == answer1[1] + 1)//判断顺子
                  {score += 31;}//顺子加31分
                   for (int q=0,w=1;q!=4;q++,w++)//有一对相同则获得10分，3 3 5 5 6 获20分，3 3 3 4 6获30分，3 3 3 3 5获60分；
              {
                   if (answer1[q]==answer1[w])
                       { score+=10;}
              }
           }
           if(score1<=score)
              {  for (int q=0;q<=4;q++)
                 {judge1[q]=answer1[q];}
                  score1=score;
               score=0;}
       }

        for(int i=0;i<=2;i++)//判断玩家2的分数
        {   int answer1[]=new int[5];//选5张
            String answer11[]=new String[5];
            for (int q=i,j=0;q<=i+4;q++,j++)
            {   answer1[j]=num2[q];
                answer11[j]=pic2[q];
            }
            if (answer11[1]==answer11[2]&&answer11[1]==answer11[3]&&answer11[1]==answer11[4]&&answer11[1]==answer11[0])//如果同花则获得39分
            {
                {
                    score += 39;
                }
                if (answer1[0] == answer1[1] + 1 && answer1[1] == answer1[1] + 1 && answer1[2] == answer1[1] + 1 && answer1[3] == answer1[1] + 1)//判断顺子
                {
                    score += 31;//顺子加31分
                    if (answer1[4] == 14)//皇家顺额外加10分
                    {
                        score += 10;
                    }
                }
            }
            else //如果不是同花
            {
                if (answer1[0] == answer1[1] + 1 && answer1[1] == answer1[1] + 1 && answer1[2] == answer1[1] + 1 && answer1[3] == answer1[1] + 1)//判断顺子
                {score += 31;}//顺子加31分
                for (int q=0,w=1;q!=4;q++,w++)//有一对相同则获得10分，3 3 5 5 6 获20分，3 3 3 4 6获30分，3 3 3 3 5获60分；
                {
                    if (answer1[q]==answer1[w])
                    { score+=10;}
                }
            }
            if(score2<=score)
            {
                {  for (int q=0;q<=4;q++)
                   {judge2[q]=answer1[q];}
                    score2=score;
                    score=0;
                }
            }
        }

        if (score1>score2)
            System.out.print("玩家1胜利！");
        else if (score2>score1)
            System.out.print("玩家2胜利！");

        else if (score1==0)// 不同色纯单牌比较
        {if (num1[6] == num2[6]) {
                if (num1[5] == num2[5]) {
                    if (num1[4] == num2[4]) {
                        if (num1[3] == num2[3]) {
                            if (num1[2] == num2[2]) {
                                System.out.print("平局！");
                            } else if (num1[2] > num2[2])
                                System.out.print("玩家1胜利！");
                            else
                                System.out.print("玩家2胜利！");
                        } else if (num1[3] > num2[3])
                            System.out.print("玩家1胜利！");
                        else
                            System.out.print("玩家2胜利！");
                    } else if (num1[4] > num2[4])
                        System.out.print("玩家1胜利！");
                    else
                        System.out.print("玩家2胜利！");
                } else if (num1[5] > num2[5])
                    System.out.print("玩家1胜利！");
                else
                    System.out.print("玩家2胜利！");
            }
        }
        else if(score1==70)//同花顺比较
        {  if(judge1[4]==judge2[4])
            System.out.print("平局！");
            else  if (judge1[4]<judge2[4])
                System.out.print("玩家2获胜！");
            else
                System.out.print("玩家1获胜！");
        }

        else if(score1==31)//一般顺子比较
        {  if(judge1[4]==judge2[4])
            System.out.print("平局！");
        else  if (judge1[4]<judge2[4])
            System.out.print("玩家2获胜！");
        else
            System.out.print("玩家1获胜！");
        }

        else if(score1==80)//皇家顺比较
        {System.out.print("平局！");}

        else if(score1==60)//4条1单比较
        {   int q,w,e,r;
            if(judge1[0]==judge2[1])
            {q=judge1[0];e=judge2[4];}
            else
            {q=judge1[1];e=judge1[0];}

            if(judge2[0]==judge2[1])
            { w=judge2[0];r=judge2[4];}
            else
            { w=judge2[1];r=judge2[0];}

            if (q==w)
            {    if (e==r)
                System.out.print("平局！");
                else if (e>r)
                    System.out.print("玩家1获胜！");
                else
                    System.out.print("玩家2获胜！");
            }
            else if (q>w)
                System.out.print("玩家1获胜！");
            else
                System.out.print("玩家2获胜！");
        }

        else if(score1==40)//3条1对比较
        {    int q,w,e,r;
            if (judge1[0]==judge1[1]&&judge1[1]==judge1[2])
            {q=judge1[0];e=judge1[3];}
            else if (judge1[1]==judge1[2]&&judge1[1]==judge1[3])
            {q=judge1[1];e=judge1[4];}
            else
            {q=judge1[2];e=judge1[0];}

            if (judge2[0]==judge2[1]&&judge2[1]==judge2[2])
            {w=judge2[0];r=judge2[3];}
            else if (judge2[1]==judge2[2]&&judge2[1]==judge2[3])
            {w=judge2[1];r=judge2[4];}
            else
            {w=judge2[2];r=judge2[0];}

            if (q==w)
            {    if (e==r)
                System.out.print("平局！");
            else if (e>r)
                System.out.print("玩家1获胜！");
            else
                System.out.print("玩家2获胜！");
            }
            else if (q>w)
                System.out.print("玩家1获胜！");
            else
                System.out.print("玩家2获胜！");
        }

        else if(score1==39)//同花不顺比较
        { int q=0,w=0,e=0,r=0,z=0,x=0,c=0,v=0;
          int flag1=0,flag2=0;
            for (int i=0,j=1;i!=4;i++,j++)
            {
                if (judge1[i]==judge1[j])
                { flag1=1;
                    q=judge1[i];
                    ArrayList judge11=new ArrayList();
                    for (int q1=0;q1<=4;q1++)
                    { judge11.add(judge1[q1]);}
                    judge11.remove(i);
                    judge11.remove(j-1);
                    w=(int) judge11.get(0);
                    e=(int) judge11.get(1);
                    r=(int) judge11.get(2);
                }
                if (judge2[i]==judge2[j])
                { flag2=1;
                    z=judge2[i];
                    ArrayList judge11=new ArrayList();
                    for (int q1=0;q1<=4;q1++)
                    { judge11.add(judge2[q1]);}
                    judge11.add(judge2);
                    judge11.remove(i);
                    judge11.remove(j-1);
                    x=(int) judge11.get(0);
                    c=(int) judge11.get(1);
                    v=(int) judge11.get(2);
                }
            }

             if (flag1>flag2)
                 System.out.print("玩家1获胜！");
             else if (flag1<flag2)
                 System.out.print("玩家2获胜！");
            else
             {
                 if (w == x)
                 {if (e == c)
                     System.out.print("平局！");
                 else if (e > c)
                     System.out.print("玩家1获胜！");
                 else
                     System.out.print("玩家2获胜！");
                 }
                 else if (w> c)
                     System.out.print("玩家1获胜！");
                 else
                     System.out.print("玩家2获胜！");
             }

        }

        else if(score1==30)//3条2单比较
        {
            int q,w,e,r,z,c;
            if (judge1[0]==judge1[1]&&judge1[1]==judge1[2])
            {q=judge1[0];e=judge1[3];z=judge1[4];}
            else if (judge1[1]==judge1[2]&&judge1[1]==judge1[3])
            {q=judge1[1];e=judge1[4];z=judge1[0];}
            else
            {q=judge1[2];e=judge1[0];z=judge1[1];}

            if (judge2[0]==judge2[1]&&judge2[1]==judge2[2])
            {w=judge2[0];r=judge2[3];c=judge2[4];}
            else if (judge2[1]==judge2[2]&&judge2[1]==judge2[3])
            {w=judge2[1];r=judge2[4];c=judge2[0];}
            else
            {w=judge2[2];r=judge2[0];c=judge2[1];}

            if (q==w)
            {    if (e>z&&e>r&&e>c)
                    System.out.print("玩家1获胜！");
                 if  (z>e&&z>r&&z>c)
                    System.out.print("玩家1获胜！");
                if (e<z&&(z<r||z<c))
                    System.out.print("玩家2获胜！");
                if (z<e&&(e<r||e<c))
                    System.out.print("玩家2获胜！");
                if (e>z&&e==r&&r>c)
                    System.out.print("平局！");
                if (z>e&&z==r&&r>c)
                    System.out.print("平局！");
                if (e>z&&e==c&&r<c)
                    System.out.print("平局！");
                if (z>e&&z==c&&r<c)
                    System.out.print("平局！");
            }
        }

        else if(score1==20)//2对1单比较
        {    int q = 0, w = 0, e = 0, r = 0, z = 0, x = 0, c = 0, v = 0,q1=5;
            ArrayList judge11 = new ArrayList();
            ArrayList judge22 = new ArrayList();
            ArrayList judge111 = new ArrayList();
            ArrayList judge222= new ArrayList();
            judge11.add(judge1);
            judge22.add(judge2);
            for (int i=0,j;i<q1-1;i++)
            {   j = i + 1;
                  for (; j < q1; j++)
                  {   if ( judge1[i]==judge1[j])
                      judge111.add(judge11.get(i));
                      judge11.remove(i);
                      judge11.remove(j-1);
                      q1-=2;i=0;
                  }
                  judge111.add(judge1[0]);
            } ;q=(int) judge111.get(0);w=(int) judge111.get(1);e=(int) judge111.get(2);
            for (int i=0,j;i<q1-1;i++)
            {   j = i + 1;
                for (; j < q1; j++)
                {   if ( judge2[i]==judge2[j])
                    judge222.add(judge22.get(i));
                    judge22.remove(i);
                    judge22.remove(j-1);
                    q1-=2;i=0;
                }
                judge222.add(judge1[0]);
            } ;z=(int) judge222.get(0);x=(int) judge222.get(1);c=(int) judge222.get(2);
            if (q == z)
            {
                if (w == x)
                {if (e == c)
                    System.out.print("平局！");
                else if (e > c)
                    System.out.print("玩家1获胜！");
                else
                    System.out.print("玩家2获胜！");
                }
                else if (w> c)
                    System.out.print("玩家1获胜！");
                else
                    System.out.print("玩家2获胜！");
            }

            else if (q > z)
                System.out.print("玩家1获胜！");
            else
                System.out.print("玩家2获胜！");

        }

        else if(score1==10)//1对3单比较
        {
            int q = 0, w = 0, e = 0, r = 0, z = 0, x = 0, c = 0, v = 0;
            for (int i = 0, j = 1; i < 4; i++) {
                j = i + 1;
                for (; j < 5; j++) {
                    if (judge1[i] == judge1[j]) {
                        q = judge1[i];
                        ArrayList judge11 = new ArrayList();
                        for (int q1 = 0; q1 <= 4; q1++) {
                            judge11.add(judge1[q1]);
                        }
                        judge11.remove(i);
                        judge11.remove(j - 1);
                        w = (int) judge11.get(0);
                        e = (int) judge11.get(1);
                        r = (int) judge11.get(2);
                    }
                    break;
                }
            }
            for (int i = 0, j; i < 4; i++) {
                j = i + 1;
                for (; j < 5; j++) {
                    if (judge2[i] == judge2[j]) {
                        z = judge2[i];
                        ArrayList judge11 = new ArrayList();
                        for (int q1 = 0; q1 <= 4; q1++) {
                            judge11.add(judge2[q1]);
                        }
                        judge11.add(judge2);
                        judge11.remove(i);
                        judge11.remove(j - 1);
                        x = (int) judge11.get(0);
                        c = (int) judge11.get(1);
                        v = (int) judge11.get(2);
                    }
                    break;
                }
            }
            if (q == z)
                {
                if (w == x)
                    {if (e == c)
                        System.out.print("平局！");
                    else if (e > c)
                        System.out.print("玩家1获胜！");
                    else
                        System.out.print("玩家2获胜！");
                    }
                else if (w> c)
                    System.out.print("玩家1获胜！");
                else
                    System.out.print("玩家2获胜！");
                }

            else if (q > z)
                System.out.print("玩家1获胜！");
            else
                System.out.print("玩家2获胜！");

        }

 System.out.println();
        }
}












