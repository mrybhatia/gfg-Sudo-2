/*

LINK : https://practice.geeksforgeeks.org/problems/replace-all-0-with-5-in-an-input-integer/1/?track=SP%20-%202.2

Given a number your task is to complete the function convertFive which replace all zeros in the number with 5 and returns the number.

Input:
The first line of input contains an integer T denoting the number of test cases . Then T test cases follow . Each test case contains a single integer N denoting the number.

Output:
The output of the function will be an integer where all zero's are converted to 5 .

Constraints:
1<=T<100
1<=N<=10000

Example:
Input
2
1004
121

Ouput
1554
121
*/


import java.util.*;
class Replace{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
      int n=sc.nextInt();
      GfG g=new GfG();
      g.convertFive(n);
    }
  }
}

class GfG{
	public static void convertFive(int n){
        char[] nu = String.valueOf(n).toCharArray();
        for(int i=0;i<nu.length;i++){
            if(nu[i] == '0'){
                nu[i] = '5';
            }
        }
        String s = new String(nu);
        int ne = Integer.parseInt(s);
        System.out.println(ne);
    }
}
