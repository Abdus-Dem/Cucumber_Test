Feature: This is just a test feature for cucumber

#Scenario: User searches a item on google and check if the title matches the keyword
#	Given I navigate to google homepage
#	When I enter a keyword to search
#	And I click on the search button
#	Then I should be able to see the title contains the keyword
	
	 

Scenario Outline: User searches a item on google and check if the title matches the keyword
	Given I navigate to google homepage
	When I enter a <keyword> to search
	And I click on the search button
	Then I should be able to see the title contains the <keyword>
	
Examples:

|keyword|
|"porsche"|
|"toyota"|
|"bmw"|
|"mercedes-benz"|


	
	
































