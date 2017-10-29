Feature: Test Train planner

  Scenario Outline: Get Longitude, Latitude and Distance when entering valid Crs code
    Given Postcode Value as "AB107AP"
    When Enter valid CRS "<Code>"
    Then Correct Cordinate X "<Longitude>" should appear
    And Correct Cordinate Y "<Latitude>" should appear
    And Correct "<Distance>" in miles should appear
    And A message should appear as Success

    Examples: 
      | Code | Longitude | Latitude | Distance |
      | ABD  |    394109 |   805933 |      2.7 |
      | PLN  |    392360 |   796759 |     6.04 |
      | STN  |    386401 |   786187 |    13.91 |
      | DYC  |    388468 |   812759 |     7.99 |
      | INR  |    377577 |   821810 |    17.66 |
      | INS  |    362957 |   827611 |    27.51 |
      | LAU  |    370900 |   770900 |    28.14 |
      | MTS  |    371210 |   758004 |     35.8 |
      | HNT  |    353536 |   839636 |    37.92 |
      | ARB  |    363871 |   740961 |    48.15 |
      | KEH  |    343007 |   851667 |    49.57 |
