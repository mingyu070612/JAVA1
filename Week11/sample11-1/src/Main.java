void main() {
    int[] students1 = new int[] {41,43,45,42,44,39}; //1학년
    int[] students2 = new int[] {41,43,45,42,44,39}; //2학년
    int[] students3 = new int[] {41,43,45,42,44,39}; //3학년

    int[][] students = new int[][]{students1,students2, students3};

    int[][] highSchoolStudents = {
            {41,43,45,42,44,0},
            {41,43,45,42,44,0},
            {41,43,45,42,44,0}
    };
    int[] total = new int[highSchoolStudents.length];
    int sum = 0;

    for(int i = 0; i< highSchoolStudents.length; i++){
        for(int j = 0; j< highSchoolStudents[i].length-1; j++){
            highSchoolStudents[i][5] += highSchoolStudents[i][j];
            total[i] += highSchoolStudents[i][j];
        }
    }

    for(int i = 0; i< highSchoolStudents.length; i++){
        sum += highSchoolStudents[i][5];
    }

    for(int i = 0; i<total.length; i++){
        sum += total[i];
    }

    for(int i = 0; i< highSchoolStudents.length; i++){
        System.out.printf("%d학년 %3d %3d %3d %3d %3d %3d\n", i+1,
                highSchoolStudents[i][0], highSchoolStudents[i][1], highSchoolStudents[i][2],
                highSchoolStudents[i][3], highSchoolStudents[i][4], highSchoolStudents[i][5]);
    }

    System.out.printf("\t\t 학교 정원: %,d 명", sum);
}
