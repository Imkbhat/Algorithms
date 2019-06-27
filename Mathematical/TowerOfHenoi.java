package com.bob.hms.admin.common.pract;

public class TowerOfHenoi {
	
	public static void towerOfHenoi(int n, char from_rod, char to_rod,  char aux_rod) {
		if (n == 1) {
			System.out.println("Move disk "+ n + " from "+ from_rod+" to "+to_rod);
			return;
		}
		towerOfHenoi(n-1, from_rod, aux_rod, to_rod);
		System.out.println("Move disk " + n + " from rod " +  from_rod + " to rod " + to_rod); 
		towerOfHenoi(n-1, aux_rod, to_rod, from_rod);
	}

	public static void main(String[] args) {
		towerOfHenoi(4, 'A', 'C', 'B');
	}

}
