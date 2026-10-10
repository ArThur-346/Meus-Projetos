package paraTreinamento2026_2;

import java.util.*;

	abstract class Usuario{
		public int getIdade() {
			return idade;
		}
		public String getNome() {
			return nome;
		}

		private int idade;
		private String nome;
		public Usuario(int idade, String nome) {
			this.nome = nome;
			this.idade = idade;
		}
		public void impU() {
			System.out.println("usuario padrao");
		}
	}
		class Cliente extends Usuario{
			protected int idC;
			protected double saldo;
			public Cliente(int idC, double saldo, int idade, String nome) {
				super(idade, nome);
				this.idC = idC;
				this.saldo = saldo;
			}
			public void impU() {
				System.out.println("cliente: " +getNome() + " id: " + idC + " idade: " + getIdade() + " saldo: " + saldo);
			}
		}
			class Adm extends Usuario{
				protected int idA;
				protected String permi;
				public Adm(String nome, int idade, int idA, String permi) {
					super(idade, nome);
					this.idA = idA;
					this.permi = permi;
				}
				public void impU() {
					System.out.println("administrador: " + getNome() + " id " + idA + " idade: " + getIdade() + " per missao: " + permi);
				}
			
		}

public class paraT_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario c = new Cliente(12345, 100000, 20, "Arhur");
		Usuario a = new Adm("Arur",19, 54321,"contabi");
		c.impU();
		a.impU();
		
		

	}
}

