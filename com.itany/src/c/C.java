//C类所处位置
package c;

//导入a中A类
import a.A;
//导入b中B类
import b.B;

//C类声明
public class C {
		//定义c方法
		public static void c(){
			//向屏幕打印输出c..
			System.out.println("c..");
		}
		//定义main方法
		public static void main(String[] args){
			//调用C类的c方法
			C.c();
			//调用A类的a方法
			A.a();
			//调用B类的b方法
			B.b();
}
		
}
