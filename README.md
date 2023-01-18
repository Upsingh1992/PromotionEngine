Project Promotion Engine:
------------------------------------------------------------------
Promotion Engine having 3 packages :-

1. com.promotionengine.calculation
 This package is having class  CostCalcucate.java which is having logic of doing promotion calculation on the basis of SKU's quantity.

2. com.promotionengine.execute
 This package is having  PromtionEngineExecute.java that is having it's constructor to initialize the few "total value with 0" and "Option value with 1"
 That class having switch case statement by which user can choose which promotion needs to apply.
 
 Note:- As of now PromotionEngine having only one active promotions that's why I set Option as 1 in future we can take user Input form scanner class like what we have for SKU's Id in
 the main package class.
 
 3. com.promotionengine.main
 
 This package will trigger the application and initialize the above two classes. This classes will ask consumer for SKU's Id quantity and pass it to PromtionEngineExecute class for the calculation.
 
