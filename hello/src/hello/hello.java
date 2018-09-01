package hello;

public class hello{
	public static int getResult(int x){
        //方法体
       int result =  x*3+5;
       return result;//返回最后的计算结果
       //return 后面可以直接是一个值 或者 一个变量
       //该值 或者 该变量 的数据类型 一定要和 返回值类型 一致  
    }

	public static void main(String[] args)
    {
        //方法的调用
        //4: 实际参数   在调用方法时实际传给方法的数据 真正参与运算
        int a = hello.getResult(4);//a用来存放 getResult()方法的返回结果
        System.out.println(a);
        System.out.println(getResult(6));      
    }
	
}
