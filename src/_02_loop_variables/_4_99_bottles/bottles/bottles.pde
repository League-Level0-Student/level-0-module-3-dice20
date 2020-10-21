

//Fix the for loop, and add the variables into the print statement such that the numbers
//in the print statement are the same for the loop variable count
for(int bots = 99; bots > 0; bots--)
{
  //Check for when bots is 1.. change the word bottles to bottle.
  //And 0 bottles of beer on the wall final verse to "no more"
  String bottlePlurality = "bottles";
  
  if(bots <= 1) bottlePlurality = "bottle";
 
  System.out.println(+bots +" " + bottlePlurality +" of beer on the wall " + bots + " " + bottlePlurality + " of beer" 
     + ", take one down pass it around " + (bots - 1 == 0 ? "no more bottles" : bottlePlurality) + " of beer on the wall\n");
     
    //Tertiary if statement..
    //(bots - 1 == 0 ? "no more bottles" : bottlePlurality)
   
}
