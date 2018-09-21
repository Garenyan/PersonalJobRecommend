package Bean;

/**
 * Created by garen on 2018/9/21.
 */
public class Company {
    private String name;
    private int monthlyPay;
    private int popularity; //分数越高，代表知名度越高。

    private final int standardPay = 14000;

    public Company()
    {

    }

    public Company(String name,int monthlyPay,int popularity)
    {
        this.name = name;
        this.monthlyPay = monthlyPay;
        setPopularity(popularity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonthlyPay() {
        return monthlyPay;
    }

    public void setMonthlyPay(int monthlyPay) {
        this.monthlyPay = monthlyPay;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        //如果知名度大于10，则根据它本身的月薪重新评定，将其限定在1-10范围内
        if (popularity>10)
        {
            //System.out.println("您输入的值大于10，请重新输入介于1到10之内的数！");

            if (Math.abs(getMonthlyPay() - standardPay) < 1000)
            {
                //int hash = popularity%10;
                this.popularity =6;

            }
            else if (getMonthlyPay()<standardPay)
            {
                this.popularity = 6 - (standardPay - getMonthlyPay())/1000;
            }
            else
            {
                this.popularity = 6 + (getMonthlyPay() - standardPay)/1000;
            }

        }
        else
            this.popularity =popularity;

    }
}
