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
  Scanner sc=new Scanner(System.in);

  // initialize values of boaed
  public void createBoard() {
    for (int i = 1; i < board.length; i++) {
      board[i] = ' ';
    }
  }
  

  public void chooseSign(){
    System.out.println("Choose X or O: ");
    
    playerSign=sc.next().toCharArray()[0];
    computerSign=(playerSign=='X')?'O':'X';
  }


  public static void main(String[] args) {
    TicTacToe game = new TicTacToe();
    game.createBoard();
    game.chooseSign();
  }
}
