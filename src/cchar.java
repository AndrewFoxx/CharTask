public class cchar {
    public static void main(String[] args) {
        /* 1 Завдання:

      char lat = 'a';

         while (lat!='{'){
             System.out.print(lat+" ");
             lat++;
         }
         lat = 'a';
         int index = 0;
        System.out.println("");
        while (lat!='{'){
            index = (int)lat;
            System.out.print(index+" ");
            lat++;
        }
    */
       /*  2 завдання:

       char lat = 'A';

        int index = 0;
        for (int i = 0; i <26 ; i++) {
            System.out.print(lat + " ");
            lat++;
        }
        lat = 'A';
        System.out.println("");
        for (int i = 0; i <26 ; i++) {
            index = (int)lat;
            System.out.print(index + " ");
            lat++;
        }
*/
       /* 3 завдання:
       String str = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < str.length() ; i++) {
            char elm = str.charAt(i);
            System.out.print(elm + "-" +(i + 1)+" ");
        }
*/
       /* 4 завдання:
        String num = "12367845678567895645674567456";
        int sum = 0;
        for (int i = 0; i < num.length() ; i++) {
            char c = num.charAt(i);
            int d = (int)c - '0';
            sum+= d;
        }
        System.out.print(sum);

        */
       /* 5 завдання
       String a = "234567345234567345636734567678912345";
        String b = "123456723456345645894567894567895678";
        int sum = 0;
        for (int i = 0; i < a.length() ; i++) {
            char c = a.charAt(i);
            int d = (int)c - '0';
            sum+= d;
        }
        for (int i = 0; i < b.length() ; i++) {
            char c = b.charAt(i);
            int d = (int)c - '0';
            sum+= d;
        }
        System.out.println(sum);
        */
/* 6 завдання
        String tel = "+380 (55)_44-33 999";
        for (int i = 0; i <tel.length() ; i++) {
            char c = tel.charAt(i);
            if (c >= '0' & c <= '9')
                System.out.print(c);
        }
 */
/*  7 завдання:
    char c = '5';
    int a = Character.getNumericValue(c);
        System.out.println(a*a);

 */
/*
        String tel = "356774215789";
        for (int i = 0; i <tel.length() ; i++) {
            char c = tel.charAt(i);
            if (c < '7')
                System.out.print("x");
            else
                System.out.print("-");
        }

 */
/*
    String a = "123";
    String b = "111";

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            char d = b.charAt(i);
            int _c = (int)c - '0';
            int _d = (int)d - '0';
            int sum = _c + _d;


            System.out.print(sum+",");
        }

 */
/* Комплексна 1:
    String a = "10111";
    String b = "0110100";
    int c = Integer.parseInt(a,2);
    int d = Integer.parseInt(b,2);
    int e = c + d;
        System.out.println(Integer.toBinaryString(e));


 */
    }
}
