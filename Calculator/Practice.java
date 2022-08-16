import java.util.Scanner;//package

class Practice{//class
    public static void main(String[] args) {//function
        Scanner scn=new Scanner(System.in);//class user input
        //calculator
         int a=scn.nextInt();
         int b=scn.nextInt();
         int operator=scn.nextInt();
         switch(operator){
            case 1:System.out.println(a+b);
            break;
            case 2: System.out.println(a-b);
            break;
            case 3: System.out.println(a*b);
            break;
            case 4:if(b==0){
                System.out.println("invalid statment");
            }else{
                System.out.println(a/b);
            }
            break;
            case 5:if(b==0){
                System.out.println("invalid statement");
            }else{
                System.out.println(a%b);
            }
            break;
            default:System.out.println("invalid");
         }

         

        }
    }
         
