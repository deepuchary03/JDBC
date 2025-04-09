
import java.util.*;
class stack {
    public static int[] stack=new int[5];
    public static int top=-1;
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("--stack--");
        int choice;
        while(true){
        System.out.println("--Menu--\n1.Push\n2.Pop\n3.Display\n4.Exit\nEnter your choice:");
        choice=sc.nextInt();
        switch(choice){
            case 1:{
                push();
                break;
                
            }
            case 2:{
                pop();
                break;
            }
            case 3:{
                display();
                break;
            }
            case 4:{
                System.out.println("program terminated");
                break;
            }
            
        }
        
        }
        
    }
    static void push(){
        int ele;
        if(top==5-1){
          System.out.println("overflow");
        }
       
        System.out.println("enter the element to insert");
        ele=sc.nextInt();
        top++;
        stack[top]=ele;
    }
    static void pop()
    {
       if(top==-1){
        System.out.println("stack underflow");
       }
       System.out.println("deleted element: "+stack[top]);
       top--;
    }
    static void display(){
        if(top==-1){
            System.out.println("stack underflow");
           }
        for(int i=0;i<stack[top];i++){
            System.out.println(stack[i]);
        }
    }
    
    
}