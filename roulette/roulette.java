package roulette;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class roulette{
	int chips;
	int more;
	int i=0;
	String name;
	int betno;
	int bet;
	int resultno;
	int win=0;
	int loss=0;
	int spin=0;
	String colour;
	Scanner myobj = new Scanner(System.in);
	void getinfo()
	{
		System.out.println("Enter Your Name");
		name=myobj.nextLine();
		System.out.println("Enter How Manyy Chips You Have");
		chips =myobj.nextInt();
		
	}
	void displayinfo()
	{
		System.out.println("Your Name is"+ name);
		System.out.println("You have "+ chips +"chips");
	}
	void playagain()
	{
		System.out.println("No. of wins"+ win);
		System.out.println("No. of loss "+ loss);
		System.out.println("No. of spins" + spin);
		int reply;
		do {
		System.out.println("Do you want to spin again?");
		System.out.println("Enter 1 for yes and 2 for no");
		reply=myobj.nextInt();
		if(reply==1)
		{
			System.out.println("Welcome back " + name + " to the Roullet");
			placebet();
		}
		
		}while(reply<2);
	}
	public void placebet()
	{
		System.out.println("Enter on which categoury you want to bet on");
		System.out.println("1) Number ");
		System.out.println("2) Odd/Even ");
		System.out.println("3) Dozen ");
		System.out.println("4) Coloumn ");
		System.out.println("5) Colour");
		int choice=myobj.nextInt();
		spin++;
		int max = 36;
        int min = 1;
        int range = max - min + 1;
  
           resultno = (int)(Math.random() * range) + min;
        
		if(resultno==2||resultno==4||resultno==6||resultno==8||resultno==10||resultno==11||resultno==13||resultno==15||resultno==17||resultno==20||resultno==22||resultno==24||resultno==26||resultno==28||resultno==29||resultno==31||resultno==33||resultno==35)
		{
			colour="Black";
		}
		else
			colour="Red";
		switch(choice){
		case 1:
			System.out.println("Enter Specific no. beterrn 1 to 36 you wnat to bet on");
		betno=myobj.nextInt();
		System.out.println("Enter how much chips you want to bet");
		bet=myobj.nextInt();
		chips=chips-bet;
		System.out.println("Chips left " + chips);
		do {
		System.out.println("Do you wamt to place more bets?,You can place upto 6 bets");
		System.out.println("Enter 1 for yes or 2 for no");
		more=myobj.nextInt();
		if (more==1)
		{
			placebet();
		}
		i++;
		}while(more<2&&i<6);
		System.out.println("And the no. is " + resultno + colour);
		conditions("number");
		break;
		case 2:
			System.out.println("Enter 1 for odd or 2 even");
		int ch1=myobj.nextInt();
		System.out.println("Enter how much chips you want to bet");
		bet=myobj.nextInt();
		chips=chips-bet;
		System.out.println("Chips left " + chips);
		do {
		System.out.println("Do you wamt to place more bets?,You can place upto 6 bets");
		System.out.println("Enter 1 for yes or 2 for no");
		more=myobj.nextInt();
		if (more==1)
		{
			placebet();
		}
		i++;
		}while(more<2&&i<=6);
		System.out.println("And the no. is " + resultno + colour);
		if(ch1==1)
		{
			conditions("odd");
		}
		else if(ch1==2)
			conditions("even");
		break;
		case 3:
			System.out.println("Enter 1,2 or 3 First Seacond or Third Dozen");
		int ch2=myobj.nextInt();
		System.out.println("Enter how much chips you want to bet");
		bet=myobj.nextInt();
		chips=chips-bet;
		System.out.println("Chips left " + chips);
		do {
		System.out.println("Do you wamt to place more bets?,You can place upto 6 bets");
		System.out.println("Enter 1 for yes or 2 for no");
		more=myobj.nextInt();
		if (more==1)
		{
			placebet();
		}
		i++;
		}while(more<2&&i<=6);
		System.out.println("And the no. is " + resultno + colour);
		if(ch2==1)
		{
			conditions("firstdozen");
		}
		else if(ch2==2)
		{
			conditions("secdozen");
		}
		else if(ch2==3)
			conditions("thirddozen");
		break;
		case 4:
			System.out.println("Enter First Seacond or Third Column");
		int ch3=myobj.nextInt();
		System.out.println("Enter how much chips you want to bet");
		bet=myobj.nextInt();
		chips=chips-bet;
		System.out.println("Chips left " + chips);
		do {
		System.out.println("Do you wamt to place more bets?,You can place upto 6 bets");
		System.out.println("Enter 1 for yes or 2 for no");
		more=myobj.nextInt();
		if (more==1)
		{
			placebet();
		}
		i++;
		}while(more<2&&i<=6);
		System.out.println("And the no. is " + resultno + colour);
		if(ch3==1)
		{
			conditions("firstcolumn");
		}
		else if(ch3==2)
			conditions("seccolumn");
		else if(ch3==3)
			conditions("thirdcolumn");
		break;
		case 5:
			System.out.println("Enter black or red");
		int ch4=myobj.nextInt();
		System.out.println("Enter how much chips you want to bet");
		bet=myobj.nextInt();
		chips=chips-bet;
		System.out.println("Chips left " + chips);
		do {
		System.out.println("Do you wamt to place more bets?,You can place upto 6 bets");
		System.out.println("Enter 1 for yes or 2 for no");
		more=myobj.nextInt();
		if (more==1)
		{
			placebet();
		}
		i++;
		}while(more<2&&i<=6);
		System.out.println("And the no. is " + resultno + colour);
		if(ch4==1)
		{
			conditions("black");
		}
		else if(ch4==2)
			conditions("red");
		break;
		}
	
	}
	public void conditions(String ch) {
		switch(ch) {
		case "number":
			if(resultno==betno)
			{
				System.out.println("Congratulaions!! You win");
				win++;
				System.out.println("You won 2X of your bet i.e." + bet);
				int winammount=bet*36;
				chips=chips+winammount;
				System.out.println("Your current total chips is:" + chips);
				
			}
			else
			{
				System.out.println("sorry you loss,better luck next time");
				loss++;
				System.out.println("You have " + chips + "left");
				
			}
			break;
		case "odd":
			if(resultno%2!=0)
			{
				System.out.println("Congratulaions!! You win by the odd");
				win++;
				System.out.println("You won 2X of your bet i.e." + bet);
				int winammount=bet*2;
				chips=chips+winammount;
				System.out.println("Your current total chips is:" + chips);
			}
			else {
				System.out.println("sorry you loss,better luck next time");
				loss++;
				System.out.println("You have " + chips + "left");
				
			}
			break;
		case "even":
			if(resultno%2==0)
			{
				System.out.println("Congratulaions!! You win by the even");
				win++;
				System.out.println("You won 2X of your bet i.e." + bet);
				int winammount=bet*2;
				chips=chips+winammount;
				System.out.println("Your current total chips is:" + chips);
			}
			else {
				System.out.println("sorry you loss,better luck next time");
				loss++;
				System.out.println("You have " + chips + "left");
				
			}
			break;
		case "black":
			if(colour=="Black")
			{
				System.out.println("Congratulaions!! You win by the colour black");
				win++;
				System.out.println("You won 2X of your bet i.e." + bet);
				int winammount=bet*2;
				chips=chips+winammount;
				System.out.println("Your current total chips is:" + chips);
			}
			else {
				System.out.println("sorry you loss,better luck next time");
				loss++;
				System.out.println("You have " + chips + "left");
				
			}
			break;
		case "red":
			if(colour=="Red")
			{
				System.out.println("Congratulaions!! You win by the colour Red");
				win++;
				System.out.println("You won 2X of your bet i.e." + bet);
				int winammount=bet*2;
				chips=chips+winammount;
				System.out.println("Your current total chips is:" + chips);
			}
			else {
				System.out.println("sorry you loss,better luck next time");
				loss++;
				System.out.println("You have " + chips + "left");
				
			}
			break;
		case "firstdozen":
			if(resultno>=1&&resultno<=12)
			{
				System.out.println("Congratulaions!! You win by the First Dozen");
				win++;
				System.out.println("You won 3X of your bet i.e." + bet);
				int winammount=bet*3;
				chips=chips+winammount;
				System.out.println("Your current total chips is:" + chips);
			}
			else {
				System.out.println("sorry you loss,better luck next time");
				loss++;
				System.out.println("You have " + chips + "left");
				
			}
			break;
		case "secdozen":
			if(resultno>=13&&resultno<=24)
			{
				System.out.println("Congratulaions!! You win by the Second Dozen");
				win++;
				System.out.println("You won 3X of your bet i.e." + bet);
				int winammount=bet*3;
				chips=chips+winammount;
				System.out.println("Your current total chips is:" + chips);
			}
			else {
				System.out.println("sorry you loss,better luck next time");
				loss++;
				System.out.println("You have " + chips + "left");
				
			}
			break;
		case "thirddozen":
			if(resultno>=25&&resultno<=36)
			{
				System.out.println("Congratulaions!! You win by the Third Dozen");
				win++;
				System.out.println("You won 3X of your bet i.e." + bet);
				int winammount=bet*3;
				chips=chips+winammount;
				System.out.println("Your current total chips is:" + chips);
			}
			else {
				System.out.println("sorry you loss,better luck next time");
				loss++;
				System.out.println("You have " + chips + "left");
				
			}
			break;
		case "firstcolumn":
			if(resultno==1||resultno==4||resultno==7||resultno==10||resultno==13|resultno==16||resultno==19||resultno==22||resultno==25||resultno==28||resultno==31||resultno==34)
			{
				System.out.println("Congratulaions!! You win by the First Coloumn");
				win++;
				System.out.println("You won 3X of your bet i.e." + bet);
				int winammount=bet*3;
				chips=chips+winammount;
				System.out.println("Your current total chips is:" + chips);
			}
			else {
				System.out.println("sorry you loss,better luck next time");
				loss++;
				System.out.println("You have " + chips + "left");
				
			}
			break;
		case "seccolumn":
			if(resultno==2||resultno==5||resultno==8||resultno==11||resultno==14||resultno==17||resultno==20||resultno==23||resultno==26||resultno==29||resultno==32||resultno==35)
			{
				System.out.println("Congratulaions!! You win by the Second Column");
				win++;
				System.out.println("You won 3X of your bet i.e." + bet);
				int winammount=bet*3;
				chips=chips+winammount;
				System.out.println("Your current total chips is:" + chips);
			}
			else {
				System.out.println("sorry you loss,better luck next time");
				loss++;
				System.out.println("You have " + chips + "left");
				
			}
		
			break;
		case "thirdcolumn":
			if(resultno==3||resultno==6||resultno==9||resultno==12||resultno==15||resultno==18||resultno==21||resultno==24||resultno==27||resultno==30||resultno==33||resultno==36)
			{
				System.out.println("Congratulaions!! You win by the Third Column");
				win++;
				System.out.println("You won 3X of your bet i.e." + bet);
				int winammount=bet*3;
				chips=chips+winammount;
				System.out.println("Your current total chips is:" + chips);
			}
			else {
				System.out.println("sorry you loss,better luck next time");
				loss++;
				System.out.println("You have " + chips + "left");
				
			}
			break;
			
			
		}
		
	}

	
}

class main{
	public static void main(String[] args)
	{
		System.out.println("Welcome to our Roulette game");
		roulette roulette1 = new roulette();
		roulette1.getinfo();
		roulette1.displayinfo();
		roulette1.placebet();	
		roulette1.playagain();
	}
}
