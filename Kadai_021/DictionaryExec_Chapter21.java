package Kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		
		//調べる単語リスト
		String[] wordsSearch = {"apple","banana","grape","orange"};
		
		//各単語の意味を調べて出力する
		  for (String word : wordsSearch) {
			  System.out.println(dictionary.getMeanig(word));
	        }
	    }
	
			
		

	}

