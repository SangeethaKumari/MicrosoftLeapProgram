//Leetcode 929. Unique Email Addresses
class FindUniqueEmails {
    public int numUniqueEmails(String[] emails) {
        Set<String> normalizedEmailSet = normalize2(emails);
        //System.out.println(normalizedEmailSet);
        return normalizedEmailSet.size();
    }

    public  Set<String> normalize2(String emails[]) {
        Set<String> normalizedEmailSet = new TreeSet<String>();

         for(String email : emails){
            String[] emailParts = email.split("@");
            String localName = emailParts[0];
            String domain= emailParts[1];
            StringBuilder newLocalName = new StringBuilder("");
            for(char c : localName.toCharArray()){
                if(c == '+'){
                    break;
                } else if(c != '.'){
                    newLocalName.append(c);
                }
            }

            String newEmail = newLocalName.toString() + "@" + domain;
            normalizedEmailSet.add(newEmail);
         }
         return normalizedEmailSet;
    }

    public  Set<String> normalize(String emails[]) {

        Set<String> normalizedEmailSet = new TreeSet<String>();
        for(String email : emails){
            String[] emailParts = email.split("@");
            String localName = emailParts[0];
            String domain= emailParts[1];
           // System.out.println("Prefix "+localName + " suffix "+domain);

            String localPart= localName.split("[+]")[0];
            localPart = localPart.replaceAll("[.]" ,"");
            String newEmail = localPart + "@" + domain;
            normalizedEmailSet.add(newEmail);
            //System.out.println("localpart "+localPart);
        
        }

        return normalizedEmailSet;
    }
}
