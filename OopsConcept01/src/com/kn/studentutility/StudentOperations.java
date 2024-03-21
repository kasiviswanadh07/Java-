package com.kn.studentutility;

public class StudentOperations {

	public void sortByIdAsc(Student[] s) {
		for (int i = 0; i < s.length - 1; i++) {
			for (int j = 0; j < s.length - i - 1; j++) {
				if (s[j].id > s[j + 1].id) {
					Student temp = s[j];
					s[j] = s[j + 1];
					s[j + 1] = temp;
				}
			}
		}
	}

	public void sortByIdDsc(Student[] s) {
		for (int i = 0; i < s.length - 1; i++) {
			for (int j = 0; j < s.length - i - 1; j++) {
				if (s[j].id < s[j + 1].id) {
					Student temp = s[j];
					s[j] = s[j + 1];
					s[j + 1] = temp;
				}
			}
		}
	}

	public void sortByNameAsc(Student[] s) {
		for (int i = 0; i < s.length - 1; i++) {
			for (int j = 0; j < s.length - i - 1; j++) {
				if (s[j].name.compareToIgnoreCase(s[j + 1].name) > s[j + 1].name.compareToIgnoreCase(s[j].name)) {
					Student temp = s[j];
					s[j] = s[j + 1];
					s[j + 1] = temp;
				}
			}
		}
	}

	public void sortByNameDsc(Student[] s) {
		for (int i = 0; i < s.length - 1; i++) {
			for (int j = 0; j < s.length - i - 1; j++) {
				if (s[j].name.compareToIgnoreCase(s[j + 1].name) < s[j + 1].name.compareToIgnoreCase(s[j].name)) {
					Student temp = s[j];
					s[j] = s[j + 1];
					s[j + 1] = temp;
				}
			}
		}
	}

	public int searchById(Student[] s, int target) {
		int mid = 0, low = 0;
		int high = s.length - 1;
		int pos = -1;
		while (low <= high) {
			mid = (low + high) / 2;
			if (target == s[mid].id) {
				pos = mid;
				break;
			} else if (target > s[mid].id) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return pos; 
	}

	public int searchByName(Student[] s, String targetName) {
		int mid = 0, low = 0;
		int high = s.length - 1;
		int pos = -1;
		while (low <= high) {
			mid = (low + high) / 2;
			if (targetName.equalsIgnoreCase(s[mid].name)){
				pos = mid;
				break;
			} else if (targetName.compareToIgnoreCase(s[mid].name)>s[mid].name.compareToIgnoreCase(targetName)) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return pos; 
	}

	public void applyGrace(Student[] s, int grace) {
		for (int i = 0; i < s.length; i++) {
			if(s[i].marks < 35) {
				 if((35 - s[i].marks) <= grace) {
					 s[i].marks = s[i].marks+(35 - s[i].marks);
				 }
			}
		}
	}

}
