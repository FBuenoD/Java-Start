#!/bin/bash

for ((i=1; i<=42; i++))
do
  if (( $i < 10 ))
  then
touch Exe0$i.java
echo "package ExerciciosPOO1_Lista_2;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe0$i {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	}

}
" > Exe0$i.java
  else
      touch Exe$i.java
echo "package ExerciciosPOO1_Lista_2;

import java.util.Scanner;
// By: Fernando Bueno Dansi 20161SI038

public class Exe$i {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	}

}
" > Exe$i.java
  fi
done
