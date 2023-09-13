package hw2;

public class hw2 {
	public static void main(String[] args) {
//第一題:
//		int sum =0;	
//			for(int i=1 ;i<=1000 ; i++) {
//				if(i%2==0) {
//					sum += i;
//				}
//			}
//			System.out.println(sum);
//		}

//第二題:
//		int sum =1;	
//			for(int i=1 ;i<=10 ; i++) {
//				sum *=i;
//			}
//			System.out.println(sum);
//		}

//第三題:	
//		int sum = 1, i=1;
//		while (i <= 10) {
//			sum *= i;
//			i++;
//		}
//			System.out.println(sum);
//	}
//		
//第四題:	
//		for (int  i = 1 ; i <=10;i++) {
//				System.out.print(i*i +" ");
//			}
//	}
//		------------------------------------------------------
//		        int n = 3; // 等差級數的公差
//		        int first = 1; // 等差級數的首項
//
//		        for (int i = 1; i <= 10; i++) {
//		            int x = first + (i - 1) * n;
//		            System.out.print(x + " ");
//		        }
//		    }
//		}

//第五題:	
//		int x = 0;
//		for (int i = 1; i <= 49; i++) {
//			int ten = i/10;
//			int single = i%10;
//		if( ten !=4 && single!=4) {
//			System.out.print(i+" ");
//			x++;
//			}		
//		}
//		System.out.println("\n"+"總共有"+x+"個數字可選 ");
//	}

////第六題:	
//		for (int a = 10; a >=0; a--) {
//			for (int b = 1; b<=a ; b++) {
//			System.out.print(b+" ");
//			}
//			System.out.println();
//		}	
////第七題:
		for (int x = 1; x <= 6; x++) {
			for (int z = 1; z <= x; z++) {
				switch (x) {
				case 1:
					System.out.print("A");
					break;
				case 2:
					System.out.print("B");
					break;
				case 3:
					System.out.print("C");
					break;
				case 4:
					System.out.print("D");
					break;
				case 5:
					System.out.print("E");
					break;
				case 6:
					System.out.print("F");
					break;
				}
			}
			System.out.println();
		}
	}
}