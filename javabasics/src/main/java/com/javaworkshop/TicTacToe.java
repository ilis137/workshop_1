package com.javaworkshop;

import java.util.Scanner;

/*
 Ability to allow the
player to choose a
letter X or O

- Create a method to allow player to
input X or O and call from main
- Determine Player and Computer
 Letter to play the game

 */
public class TicTacToe {

  char[] board = new char[10];
  char playerSign;
  char computerSign;
 

  // initialize values of boaed
  public void createBoard() {
    for (int i = 1; i < board.length; i++) {
      board[i] = ' ';
    }
  }
  
//
  public void chooseSign(Scanner sc){
    System.out.println("Choose X or O: ");
    char sign=sc.next().toCharArray()[0];
    if(sign!='X'||sign!='O'){
       System.out.println("Invalid sign:Please enter either X or O ");
    }else{
      playerSign=sign;
      computerSign=(playerSign=='X')?'O':'X';
    }
  }


  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    TicTacToe game = new TicTacToe();
    game.createBoard();
    game.chooseSign(sc);
    sc.close();
  }
}
