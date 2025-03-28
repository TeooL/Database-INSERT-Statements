public class PopulateCourses {
    public static void main(String[] args) {
        String[] courses= {"Anatomy", "AP Biology","AP Environmental", "AP Psychology", "Bio-organic Chemistry", "Genetics", "Introduction to Neuroscience", "Living Environment", "Living Environment Lab", "Environmental sustainability",
                "Regents Chemistry", "AP Chemistry", " Organic Chemistry", "MICA", "Quantitative Analysis", "Forensics", "Regents Physics", "Regents Physics Labs", "AP Physics 1", "AP Physics 2", "AP Physics C Mechanics", "AP Physics C E/M", "Astronomy", "Modern Physics",
                "Common Core Algebra","Common Core Geometry","Common Core Algebra II","Pre-Calculus","Calculus (non-AP)","AP Calculus (AB)","AP Calculus (BC)","AP Statistics","Multivariable Calculus","Math Research","Linear Algebra",
                "AP Computer Science Principles","AP Computer Science A","Big Data: Warehousing & Analytics","Computer Science & Engineering Home","Cyber Security","Digital Electronics (Project Lead the Way)","Digital Systems Design","Electrical Engineering Major","Fundamentals of IT Infrastructure","Green Building Construction","PLTW EDD","Statics","Strength of Materials","Web Development",
                "Physical Education", "Health Education", "9th Grade English","10th Grade English","10th Grade: AP Capstone Seminar","11th Grade English","11th Grade: AP English Language & Composition","12th Grade: AP Capstone Research","12th Grade: AP English Literature & Composition","12th Grade: Creative Writing","12th Grade: Drama","12th Grade: Film & Literature","12th Grade: Journalism","12th Grade: Life, Love & Death","12th Grade: Mystery, Horror & the Supernatural","12th Grade: Science Fiction & Fantasy","12th Grade: Yearbook","The Survey",
                "9th Grade Global","10th Grade Regents Global History","AP World History","AP European History","11th Grade Regents American History","AP American History","Participation in Government","AP US Government Economics","AP Macroeconomics","AP Microeconomics","AP Comparative Government","AP Psychology","AP Human Geography Sociology","Cultural Anthropology","Physical Anthropology",
                "Chinese","AP Chinese Language and Culture","French","AP French Language and Culture","German","AP German Language and Culture","Italian","AP Italian Language and Culture","Spanish","Spanish IV","AP Spanish Language and Culture","AP Spanish Literature and Culture"
        };
        int type = 1;
        int i = 0;
        for (String course : courses){
            i += 1;
            if (course.contains("AP")){
                type = 1;
            }else if (course.contains("Regents")){
                type = 2;
            }else{
                type = 3;
            }
            System.out.println("INSERT INTO Courses(c_id, t_id, course) VALUES (" + i + "," + type + ",'"+ course+"') FOREIGN KEY (t_id) REFERENCES Course_Type (t_id));");
        }
    }
}
