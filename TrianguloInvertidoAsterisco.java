/*
DESAFIO DE PROGRAMAÇÃO - ACADEMIA CAPGEMINI

# Questão 01

Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços. 
A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.
Exemplo:
Entrada:
n = 6

Saída:
     *
    **
   ***
  ****
 *****
******
*/


import java.io.*;

// Codigo em Javacom a finalidade de imprimir um triangulo retangulo isoceles (Escada) com caracter "*" asterico.

public class TrianguloInvertidoAsterisco
{
	// Funcao para demonstrar o padrao de impressao
	public static void imprimeAstericos(int n)
	{
		int i, j;

		// loop externo para lidar com o número de linhas, neste caso o "n"
		for(i=0; i<n; i++)
		{

			// loop interno para lidar com espacos numericos (aninhado)
			// os valores mudam em relacao ao acumulo de valores da funcao
			for(j=2*(n-i); j>=0; j--)
			{
				// Imprime espacos
				System.out.print(" ");
			}
			
			// loop interno para lidar com o numero de colunas
			// os valores mudam em relacao ao acumulo do loop externo
			for(j=0; j<=i; j++)
			{
				// Inprime astericos com espaco
				System.out.print("* ");
			}
			
			// imprime uma linha final após cada linha
			System.out.println();
		}
	}

	// funcao de controle
	public static void main(String args[])
	{
		// valor de controle = "6"
		int n = 6;
		imprimeAstericos(n);
	}
}
