public class StudentManager {
    //Khia bao mang chua danh sach sinh vien
    Student studentList[] = new Student[50];
    //so sinh vien da luu tru
    int numOfStudent = 0;
    //phuong thuc lay sinh vien theo index
    public Student getStudnetByIndex(int index){
        return studentList[index];
    }
    
    //them sinh vien moi
    public int addStudent(Student newStudent){
        if(numOfStudent < studentList.length){
            studentList[numOfStudent++] = newStudent;
            return 1;
        }else{
            return 0;
        }
    }//end add Student
    //in danh sach sinh vien
    public void printStudentList(){
        System.out.println("Student List: ");
        for (int i = 0; i < numOfStudent; i++) {
            System.out.println(studentList[i].toString());
        }
    }//end in studentList
    
    //tim sinh vien theo ID
    public int findStudent(String ID){
        int result = 0;
        for (int i = 0; i < numOfStudent; i++) {
            if(studentList[i].getmID() == ID){
                return 1;
            }
        }
        return result;
    }//end find student
    
    //cap nhat 
    public void updateStudent(Student newStudent){
        
    }//end updateStudent
    //end class
    
    
}
