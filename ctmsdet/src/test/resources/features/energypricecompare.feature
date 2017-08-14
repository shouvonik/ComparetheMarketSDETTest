Feature: User should be able to compare the tariff of energy suppliers exists in the market
  
  @RunMe
  Scenario: Verify that user is able to compare the tariff of Electricity Suppliers in the market
     When User launches comparethemarket website "https://energy.comparethemarket.com/energy/v2/?AFFCLIE=TSTT"
      And Provides postcode "PE2 6YS"
      And User clicks on Find Postcode
      And User chooses no bill option
      Then User selects electricity only to compare
      Then User selects the current supplier as "npower"
      And Clicks on Next
      Then User selects no prepayment meter option
      And User selects no economy meter option
      And User selects that current spend on electricity is not known
      And Clicks on Next
      Then User answers the energy questionnaire
      And Clicks on Next
      Then User selects "All Tariff" preference
      And User selects Payment Type As "All"
      Then User chooses YES to see only the switch to now options
      And User shares email "abc@gmail.com"
      And chooses not to stay updated with latest products
      And agrees to the terms and conditions
      And Clicks on Go to prices
      Then User should be able to see the tariff options of Electricity Suppliers