// C++ code
//

void setup()
{
  Serial.begin(9600);
  pinMode(13, OUTPUT);
  pinMode(12, OUTPUT);
  digitalWrite(13,LOW);
  digitalWrite(12,LOW);
}

void loop()
{
  if(Serial.available()){
  	String input=Serial.readString();
    String morse=extract(input);
    morsetolight(morse);
    
  }
}

String extract(String input){
 String ans="";
  for(int i=0;i<input.length();i++){
   char ch=input[i];
    if(ch=='.' || ch=='-'){
     ans+=ch; 
    }else if(ch==' ')
    {
     ans+=" "; 
    }
  }
  return ans;
}

void morsetolight(String morse)
{
  for(int i=0;i<morse.length();i++){
   char ch=morse[i];
    digitalWrite(13,HIGH);
    tone(12,900);
    if(ch=='.')
    {
      delay(300);
    }
    else if(ch=='-')
    {
     delay(900);
    }
    else
    {
      digitalWrite(13,LOW);
      noTone(12);
      delay(700);
    }
   digitalWrite(13,LOW);
   noTone(12); 
   delay(300);
 }


}



