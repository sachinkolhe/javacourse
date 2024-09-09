package enumexample;

public class EnumExample {
    public static void main(String[] args) {
        Day today = Day.FRIDAY;
        
        Vowels vowel = Vowels.A;

        switch (today) {
            case MONDAY:
                System.out.println("Start of the work week.");
                break;
            case FRIDAY:
                System.out.println("End of the work week.");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekend!");
                break;
            default:
                System.out.println("Midweek days.");
                break;
        }
    }
}


//group of constants 
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

/**
 * this is representation of enum internally in java.
 * 
 * public class Day {
 * 	public static final Day SUNDAY = new Day();
 * }
 * */


enum FileState {
	READING_IN_PROGRESS, READ_COMPLETED, READ_FAILED
}

enum Alphabets {
	A;
}

enum Vowels {
	A,E,I,O,U;
}

/**
 * 
 * Use Case:
 * 
 * save fileState as READING_IN_PROGRESS. save this in db.
 * try {
 * 		file reading.
 * 
 * 		file reading completed.
 * 		save fileState as READ_COMPLETED
 * }catch(Exception ex) {
 * 		save fileState as READ_FAILED
 * }
 * 
 * 
 * 
 * */
 