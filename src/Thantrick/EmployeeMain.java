package Thantrick;

import java.util.Arrays;
import java.util.Date;

public class EmployeeMain {

	public static void main(String[] args) {

		Address comAddr1 = new Address("#246", "Chamrajpet", "Near gov hospital", "Dubai", 322232, "Dubai", "UAE");
		Address comAddr2 = new Address("#296", "Chamrajpet", "Near gov hospital", "Mumbai", 655008, "Maharashtra",
				"India");
		Address comAddr3 = new Address("#186", "Jai Nagar", "Near gov school", "New York", 453455, "California", "USA");
		Address comAddr4 = new Address("#646", "Jai Nagar", "Near privateHospital", "Davanagere", 577001, "Karnataka",
				"India");
		Address comAddr5 = new Address("#242", "K T J Nagar", "Near tank park", "Durban", 677003, "Karnataka",
				"South Africa");

		Address perAdd1 = new Address("#242", "K T J Nagar", "Near tank park", "Chitradurga", 677861, "Karnataka",
				"India");
		Address perAdd2 = new Address("#186", "Jai Nagar", "Near gov school", "Thiruvananthapuram", 122322, "Kerala",
				"India");
		Address perAdd3 = new Address("#646", "Kuvempu Nagar", "Near privateHospital", "Bhopal", 986753,
				"Madhya Pradesh", "India");
		Address perAdd4 = new Address("#646", "Vijay Nagar", "Near private hospital", "Mumbai", 655004, "Maharashtra",
				"India");
		Address perAdd5 = new Address("#146", "Mcc B block", "Near A K building", "Davanagere", 577004, "Karnataka",
				"India");

		Address clnAdd1 = new Address("#b145", "K T J Nagar", "Near tank park", "Chitradurga", 677864, "Karnataka",
				"India");
		Address clnAdd2 = new Address("#c213", "Jai Nagar", "Near govschool", "Changi", 6545, "Changi", "Singapore");
		Address clnAdd3 = new Address("#a212", "Kuvempu Nagar", "Near privatehospital", "NewYork", 453458, "California",
				"USA");
		Address clnAdd4 = new Address("#a398", "Vijay Nagar", "Near privatehospital", "Shivmoga", 644566, "Karnataka",
				"India");
		Address clnAdd5 = new Address("#b333", "Mcc B block", "Near A K building", "Durban", 677006, "Durban",
				"South Africa");

		Client clnt1 = new Client("khalid", "20/08/1996", clnAdd1);
		Client clnt2 = new Client("khalid", "20/08/1996", clnAdd2);
		Client clnt3 = new Client("khalid", "20/08/1996", clnAdd3);
		Client clnt4 = new Client("khalid", "20/08/1996", clnAdd4);
		Client clnt5 = new Client("khalid", "20/08/1996", clnAdd5);

		Project pro1 = new Project("GHS", new Date(12 - 4 - 2020), new Date(8 - 06 - 2021), clnt1);
		Project pro2 = new Project("EB", new Date(03 - 07 - 2020), new Date(14 - 07 - 2021), clnt2);
		Project pro3 = new Project("EA", new Date(23 - 01 - 2020), new Date(25 - 8 - 2022), clnt3);
		Project pro4 = new Project("CPS", new Date(21 - 06 - 2020), new Date(28 - 07 - 2021), clnt4);
		Project pro5 = new Project("TM", new Date(21 - 10 - 2020), new Date(05 - 9 - 2021), clnt5);

		Employee[] emps = {
				new Employee("Nitha", "4E1", "Female", new Date(), new String[] { "React", "Css" }, 70000,
						new Address[] { comAddr1, perAdd1 }, pro1),
				new Employee("Sunitha", "4E2", "Female", new Date(), new String[] { "Css", "Angular", "React" }, 20000,
						new Address[] { comAddr2, perAdd2 }, pro2),
				new Employee("Ramesh", "4E3", "Male", new Date(), new String[] { "Html", "React", "Aws" }, 85000,
						new Address[] { comAddr3, perAdd3 }, pro3),
				new Employee("Sahil", "4E4", "Male", new Date(), new String[] { "React" }, 87000,
						new Address[] { comAddr4, perAdd4 }, pro4),
				new Employee("Akash", "4E5", "Male", new Date(), new String[] { "Css", "Aws", "React" }, 45000,
						new Address[] { comAddr5, perAdd5 }, pro5) };

		System.out.println("===================================================================");

		String dInitial = "H";
		Employee[] startWH = getEmpAddCitySameOrNot(emps, dInitial);
		for (int i = 0; i < startWH.length; i++) {
			if (startWH[i] != null) {
				Employee s = startWH[i];
				System.out.println("Employee start with h:" + s.getAddress()[i].getCity());

			}
		}

		System.out.println("===================================================================");

		Employee[] sameCitEmpls = getEmpsCityEquals(emps);
		for (int i = 0; i < sameCitEmpls.length; i++) {
			if (sameCitEmpls[i] != null) {
				Employee empsObj = sameCitEmpls[i];
				System.out.println("Same city Employee Object" + empsObj);
			}

		}

		System.out.println("===================================================================");

		String coun = "India";
		int mBonus = 50000;
		int fBonus = 100000;
		Employee[] empsGotBonus = getAddBonusWhoWorkForignCountry(emps, coun, fBonus, mBonus);
		for (int i = 0; i < empsGotBonus.length; i++) {
			if (empsGotBonus[i] != null) {
				Employee gotSalEmps = empsGotBonus[i];
				System.out.println("Employees with hikeSalary:" + gotSalEmps);
			}
		}

		System.out.println("===================================================================");

		String cityLim = "Davanagere";
		int incrSalForDvg = 25000;
		Employee[] incSalWhoWorkDvg = getAddBonusWhoWorkDvgCity(emps, cityLim, incrSalForDvg);
		for (int i = 0; i < incSalWhoWorkDvg.length; i++) {
			if (incSalWhoWorkDvg[i] != null) {
				Employee gotemp = incSalWhoWorkDvg[i];
				System.out.println("Emp object hike salary live in dvg:" + gotemp);
			}
		}

		System.out.println("===================================================================");

		System.out.println("<<<<find first digit>>>>>");
		int no = 5;
		String empsNamePinStartFive = getFindFirstDigitPinMatch(emps, no);
		System.out.println("Emps names start pin no with 5:" + empsNamePinStartFive);

		System.out.println("===================================================================");

		System.out.println("<<<<<<==Emps salary Incre who live in karnatak state");
		String empsNameLiveKar = getWhoLiveInKarnataka(emps);

		System.out.println("Emps name whose hike sal live in kar:" + empsNameLiveKar);

		System.out.println("===================================================================");

		System.out.println("<<<<<<how much emps perhour salary>>>>>");

		String empName = "Ramesh";
		int holidays = 0;
		int leavesDay = 0;
		String[] empsPerHrsSalAndName = getEmpsSalPerHrsAndLessSalOfLeaDays(emps, leavesDay, empName, holidays);
		for (int i = 0; i < empsPerHrsSalAndName.length; i++) {
			if (empsPerHrsSalAndName[i] != null) {
				System.out.println("Emps Name and Perhrs Sal:" + empsPerHrsSalAndName[i]);
			}
		}

		System.out.println("===================================================================");

		System.out.println("Employees Technologies");
		String[] technolo = new String[] { "Java", "Angular", "mySql" };
		Employee[] empsHavBothTech = getEmpsTech(emps, technolo);
		for (int i = 0; i < empsHavBothTech.length; i++) {
			if (empsHavBothTech[i] != null) {
				Employee empHavBothTech = empsHavBothTech[i];
				System.out.println("Emps have both technologies:" + empHavBothTech);
			}
		}
		
		System.out.println("===================================================================");
		
		System.out.println("Onsite highest Salary Employee");
		
		Employee higSalOnsite =getEmpTakingHigSalOnsite(emps,coun);
			System.out.println("onsite taking high salary employee:"+higSalOnsite);
	}

	private static Employee getEmpTakingHigSalOnsite(Employee[] emps,String coun) {
		// TODO Auto-generated method stub
		Employee higSalEmpOnst=null;
		int onstEmpHighSal=0;
		for (int i = 0; i < emps.length; i++) {
			if(!emps[i].getProject().getClient().getAddress().getCountry().equals(coun)
					&& emps[i].getAddress()[0].getCountry().equals(emps[i].getProject().getClient()
							.getAddress().getCountry())) {
				if(emps[i].getSalary()>onstEmpHighSal) {
					onstEmpHighSal=emps[i].getSalary();
					higSalEmpOnst=emps[i];
				}
			}
			
		}
		return higSalEmpOnst;
	}

	private static Employee[] getEmpsTech(Employee[] emps, String[] technolo) {
		Employee[] empsHavBothTech = new Employee[emps.length];

		int k = 0;
		for (int i = 0; i < emps.length; i++) {

			int count = 0;
			for (int j = 0; j < technolo.length; j++) {

				for (int j2 = 0; j2 < emps[i].getTechnologies().length; j2++) {

					if (technolo[j].equals(emps[i].getTechnologies()[j2])) {
						count++;
						k++;
						break;
					}

				}

				if (count == 1) {
					empsHavBothTech[k] = emps[i];
					k++;
					break;
				}

			}

		}

		return empsHavBothTech;

	}

	private static String[] getEmpsSalPerHrsAndLessSalOfLeaDays(Employee[] emps, int leavesDay, String empName,
			int holidays) {
		// TODO Auto-generated method stub
		String[] empsPerHrsSal = new String[emps.length];
		int oneDayHrs = 8;
		int holidaysHrs = oneDayHrs * holidays;
		int leaveDaysHrs = oneDayHrs * leavesDay;
		int empSal = 0;
		for (int i = 0; i < emps.length; i++) {
			if (emps[i].getName().equals(empName)) {
				int perHrsSal = emps[i].getSalary() / 160;
				empSal = emps[i].getSalary() - (perHrsSal * (leaveDaysHrs + holidaysHrs));
				empsPerHrsSal[i] = emps[i].getName() + ": " + "Total Salary:" + emps[i].getSalary()
						+ " per hour salary:" + perHrsSal + " working days salary:" + empSal + "\n";
			}

		}
		return empsPerHrsSal;

	}

	private static String getWhoLiveInKarnataka(Employee[] emps) {

		String empsNameWhoLiveInKar = "";
		for (int i = 0; i < emps.length; i++) {
			if (emps[i].getAddress()[0].getState().equals("Karnataka")) {
				emps[i].setSalary(50000 + emps[i].getSalary());
				emps[i].getProject().setStartDate(emps[i].getProject().getStartDate());
				Date sss = emps[i].getProject().getStartDate();
				System.out.println(">>>>>>>><<<<<>:" + sss);
				empsNameWhoLiveInKar = empsNameWhoLiveInKar + " " + emps[i].getName();
			}
		}

		return empsNameWhoLiveInKar;
	}

	private static String getFindFirstDigitPinMatch(Employee[] emps, int limNo) {

		String namePinStartFive = "";
		for (int i = 0; i < emps.length; i++) {
			int pin = emps[i].getAddress()[0].getPincode();
			while (pin >= 10)
				pin /= 10;

			if (pin == limNo) {
				namePinStartFive = namePinStartFive + " " + emps[i].getName();
			}
		}
		return namePinStartFive;
	}

	private static Employee[] getAddBonusWhoWorkDvgCity(Employee[] emps, String cityLim, int incrSalForDvg) {
		Employee[] incEmpSal = new Employee[emps.length];
		int j = 0;
		for (int i = 0; i < incEmpSal.length; i++) {
			if (emps[i].getAddress()[0].getCity().equals(cityLim)) {
				emps[i].setSalary(incrSalForDvg + emps[i].getSalary());
				incEmpSal[j] = emps[i];
				j++;
			}
		}

		return incEmpSal;
	}

	private static Employee[] getAddBonusWhoWorkForignCountry(Employee[] emps, String country, int fbonus, int mBonus) {

		for (int i = 0; i < emps.length; i++) {
			String gen = emps[i].getGender();
			if (!emps[i].getAddress()[0].getCountry().equals(country) && emps[i].getAddress()[0].getCountry()
					.equals(emps[i].getProject().getClient().getAddress().getCountry())) {
				if (gen.equals("Female")) {
					emps[i].setSalary(fbonus + emps[i].getSalary());
				}
				if (emps[i].getGender().equals("Male")) {
					emps[i].setSalary(mBonus + emps[i].getSalary());
				}

			}
		}
		return emps;
	}

	private static Employee[] getEmpsCityEquals(Employee[] emps) {
		// TODO Auto-generated method stub
		Employee[] empsSamCity = new Employee[emps.length];
		int j = 0;
		for (int i = 0; i < emps.length; i++) {
			if (emps[i].getAddress()[0].getCity().equals(emps[i].getProject().getClient().getAddress().getCity())) {

				empsSamCity[j] = emps[i];
				j++;
			}
		}

		return empsSamCity;

	}

	private static Employee[] getEmpAddCitySameOrNot(Employee[] emp, String limitLetter) {
		Employee[] startWithH = new Employee[emp.length];
		int j = 0;
		for (int i = 0; i < emp.length; i++) {
			if (emp[i].getAddress()[0].getCity().startsWith(limitLetter)) {
				startWithH[j] = emp[i];
				j++;
			}
		}
		return startWithH;
	}
}