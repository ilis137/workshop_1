package com.javaworkshop;

/*
 * As a Player would like to
start fresh by creating a tic
tac toe board - Create a TicTacToeGame class - Create method for every use case
and call from main
- Create a board of char[] of size 10
and assign empty space to each
element

 */
public class TicTacToe {

  char[] board = new char[10];

  // initialize values of boaed
  public void createBoard() {
    for (int i = 1; i < board.length; i++) {
      board[i] = ' ';
    }
  }

  public static void main(String[] args) {
    TicTacToe game = new TicTacToe();
    game.createBoard();
  }
}
