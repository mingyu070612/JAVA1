void main() {
    int[] step1 = {3,3,3,0};
    int[] step2 = {3,3,3,0};
    int[] step3 = {3,3,3,0};
    int[] step4 = {3,3,3,0};
    int[] step5 = {3,3,3,0};

    int[][] villa1 = {step1,step2,step3,step4,step5};
    int[][] villa2 = {step1,step2,step3,step4,step5};
    int[][] villa3 = {step1,step2,step3,step4,step5};

    int[][][] villa = {villa1,villa2,villa3};

    int[][][] somang = new int[][][]{villa1,villa2,villa3};
    int[][] total = new int[somang.length][villa1.length];
    int[] sum = new int[somang.length];
    int tos=0;

    for(int i = 0; i<somang.length; i++){
        for(int j=0; j<somang[i].length;j++){
            for(int k = 0; k<somang[i][j].length; k++){
                total[i][j] += somang[i][j][k];
            }
        }
    }

    for(int i = 0; i< total.length; i++){
        for(int j = 0; j<total[i].length; j++){
            sum[i] += total[i][j];
        }
    }

    for(int i = 0; i< sum.length; i++){
        tos += sum[i];
    }


    for(int i = 0; i<somang.length; i++){
        System.out.printf("%d동 주민수\n", i+1);
        for(int j = 0; j<somang[i].length; j++){
            System.out.printf("%d 층\n",j+1);
            for(int k = 0; k<somang[i][j].length-1; k++){
                System.out.printf("%d호 ", k+1);
            }
            System.out.println("합계 ");
        }
        System.out.println(" 동별 합계:");
    }
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println("빌라 합계: ");
}