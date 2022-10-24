package prac_6;

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student("Евгений", 3.0);
        Student s2 = new Student("Анатолий", 4.8);
        Student s3 = new Student("Екатерина", 3.8);
        Student s4 = new Student("Анна", 2.8);
        Student s5 = new Student("Татьяна", 4.2);
        Student s6 = new Student("Павел", 4.0);
        Student[] iDNumber = new Student[] {s1, s2, s3, s4, s5, s6};

        //Insertion_Sort(iDNumber);
        //SortingStudentsByGPA sort = new  SortingStudentsByGPA();
        // sort.selectionSort(iDNumber);
        mergeSort(iDNumber, iDNumber.length);
        for(int i=0; i<iDNumber.length; i++){
            iDNumber[i].getInfo();
        }
    }

    public static void Insertion_Sort(Student[] list){
        int n = list.length;
        Student temp;
        for(int i=0; i<n; i++){
            for(int j=i; j>0 && list[j-1].getGrade() > list[j].getGrade(); j--){
                temp = list[j-1];
                list[j-1] = list[j];
                list[j] = temp;
            }
        }
    }

    public static void mergeSort(Student[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        Student[] l = new Student[mid];
        Student[] r = new Student[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    public static void merge(
            Student[] a, Student[] l, Student[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i].getGrade() >= r[j].getGrade()) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
}
