package Stack;

import java.util.Stack;

public class Stock_Span {//we have to check how many consecative days price<=today's price

    public static void stockspan(int stocks[],int span[]){
        Stack<Integer> s = new Stack<>();//stack of previous high index
        span[0]=1;//Always our 1st day span value is zero
        s.push(0);
        //Now we calculate span
        //first find what is  current price of stock
        //we already calculate zeroth or first span then start from remaining one
        for(int i=1;i<stocks.length; i++){
            int currprice=stocks[i];
            //then while loop for util stack is not empty and current price is greater than previos price

            while (!s.isEmpty() && currprice > stocks[s.peek()]){
                //we get previous high when we get high price than todays price price or we can say all small prices get deleted
                // so until we delete
                s.pop();//delete to remove smaller values than today
            }
            //AT the end we get our previous high
            //span =i(current stock index)-previous hight index
            //check is our stack is empty because of deletation
            if(s.isEmpty()) {
                span[i]=i+1;
            }
            else {
                int prevhigh=s.peek();
                span[i]=i-prevhigh;

            }
            s.push(i);


        }
    }

    public static void main(String[] args) {
        int stocks[]={100,80,60,70,60,85,100};
        int span[]=new int[stocks.length];
        stockspan(stocks,span);

        for(int i=0;i<span.length;i++){
            System.out.println(span[i]);
        }

    }
}
//This is a Java program that calculates the stock span of a given array of stock prices. The stock span is defined as the number of consecutive days starting from the current day, for which the stock price is less than or equal to the price of the current day.
//
//The program uses a stack to keep track of the previous high indices, and calculates the stock span for each day by comparing the current price with the previous high. The algorithm works as follows:
//
//Create an empty stack to keep track of the previous high indices.
//Set the span of the first day to 1, since there are no previous days to compare with.
//Push the index of the first day onto the stack.
//For each subsequent day, compare the current price with the price at the previous high index, and remove all indices from the stack that have prices less than the current price.
//Calculate the stock span as the difference between the current index and the previous high index.
//If the stack is empty after removing all lower prices, set the stock span to the current index plus one.
//Push the current index onto the stack.
//The program defines a static method called stockspan that takes two integer arrays as input: the array of stock prices and an empty array to store the stock spans. The program then calls the stockspan method with the stock prices and span arrays as arguments, and prints out the resulting array of stock spans.
//
//Overall, this program provides an efficient solution for calculating stock spans using a stack data structure.