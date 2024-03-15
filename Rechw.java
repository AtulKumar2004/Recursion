public class Rechw {
    public static void printindofkey(int arr[],int i,int key,int c){
        if(i==arr.length)
        {
            if(c==0)
            {
                System.out.println("Key not found in the array");
            }
            return;
        }
        if(arr[i]==key)
        {
            c=1;
            System.out.print(i+" ");
        }
        printindofkey(arr, i+1, key,c);
        
    }
    public static void convertinttowords(int num,int ld){
        if(num==0)
        {
            return;
        }
        ld=num%10;
        convertinttowords(num/10,ld);
        if(ld==0){
            System.out.print("Zero ");
        }
        if(ld==1){
            System.out.print("One ");
        }
        if(ld==2){
            System.out.print("Two ");
        }
        if(ld==3){
            System.out.print("Three ");
        }
        if(ld==4){
            System.out.print("Four ");
        }
        if(ld==5){
            System.out.print("Five ");
        }
        if(ld==6){
            System.out.print("Six ");
        }
        if(ld==7){
            System.out.print("Seven ");
        }
        if(ld==8){
            System.out.print("Eight ");
        }
        if(ld==9){
            System.out.print("Nine ");
        }
    
    }
    public static void lengthofstr(String st,int i,int c){
        if (st.charAt(i+1)=='\0')
        {
            System.out.println(++c);
            return;
        }
        lengthofstr(st,i+1,c+1);
    }
    public static void countsubstr(String str,int i,int point,int c){
        if(i==str.length()){
            System.out.println(c);
            return;
        }
        if(point==str.length()){
            i++;
            point=i-1;
        }
        else if(str.charAt(i)==str.charAt(point)){
            c++;
        }
        countsubstr(str,i,point+1,c);

    }
    public static void main(String[] args) {
        // int arr[]={3, 2, 4, 5, 6, 2, 7, 2, 2};
        // printindofkey(arr, 0, 10, 0);
        // convertinttowords(1008,0);
        // lengthofstr("hello\0",0,0);
        countsubstr("aba", 0, 0, 0);

    }
}
