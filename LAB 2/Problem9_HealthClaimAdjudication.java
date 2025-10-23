import java.util.Scanner;

public class Problem9_HealthClaimAdjudication {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        System.out.print("Enter claim type (inpatient/outpatient): ");
        String claimType = x.next().toLowerCase();
        
        System.out.print("Enter hospital grade (A/B/C): ");
        char hospitalGrade = Character.toUpperCase(x.next().charAt(0));
        
        System.out.print("Enter bill amount: ");
        double billAmount = x.nextDouble();
        
        System.out.print("Has preapproval? (Enter 1 or 2)\n1. Yes\n2. No\n");
        int hasPreapproval = x.nextInt();
        
        System.out.print("Enter hours since admission (for emergency check): ");
        int hoursSinceAdmission = x.nextInt();
        
        System.out.print("Is hospital in network? (Enter 1 or 2)\n1. Yes\n2. No\n");
        int inNetwork = x.nextInt();
        
        double reimbursement = 0;
        String decision = "";
        boolean isApproved = false;
        
        double policyMaxA = 10000;
        double policyMaxB = 8000;
        double policyMaxC = 6000;
        
        double minimalThreshold = 100;
        double midCap = 2000;
        
        if (claimType.equals("inpatient")) {
            if (hasPreapproval == 1 || hoursSinceAdmission <= 24) {
                decision = "Proceed with inpatient claim";
                isApproved = true;
                
                if (hospitalGrade == 'A') {
                    reimbursement = billAmount * 0.9;
                    if (reimbursement > policyMaxA) {
                        reimbursement = policyMaxA;
                    }
                } 
                else if (hospitalGrade == 'B') {
                    reimbursement = billAmount * 0.8;
                    if (reimbursement > policyMaxB) {
                        reimbursement = policyMaxB;
                    }
                } 
                else if (hospitalGrade == 'C') {
                    reimbursement = billAmount * 0.7;
                    if (reimbursement > policyMaxC) {
                        reimbursement = policyMaxC;
                    }
                } 
                else {
                    decision = "Reject - invalid hospital grade";
                    isApproved = false;
                    reimbursement = 0;
                }
            } 
            else {
                decision = "Reject inpatient claim - no preapproval and not emergency admission within 24 hours";
            }
        }
        else if (claimType.equals("outpatient")) {
            if (billAmount < minimalThreshold) {
                decision = "Reject outpatient claim - below minimal threshold";
            } 
            else {
                if (hospitalGrade == 'A' && billAmount > midCap) {
                    decision = "Require doctor note for outpatient claim";
                } 
                else {
                    reimbursement = billAmount * 0.6;
                    decision = "Approve outpatient claim - 60% reimbursement";
                    isApproved = true;
                }
            }
        }
        else {
            decision = "Reject - invalid claim type";
        }
        if (isApproved && inNetwork == 2) { 
            reimbursement = reimbursement * 0.8;
            decision += " (20% reduction for out-of-network)";
        }
        
        System.out.println("\nClaim Decision: " + decision);
        if (reimbursement > 0) {
            System.out.println("Reimbursement Amount: $" + String.format("%.2f", reimbursement));
        }
    }
}