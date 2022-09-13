@smoke
  Feature:
    Scenario:Add Product to the Wishlist
      When User click on wishlist button ❤️ on this product "HTC One M8 Android L 5.0 Lollipop"
      Then you will see success message "The product has been added to your wishlist" with green background color

      Scenario: User click on Wishlist link and Observe QTY is greater than 1
        When User click on wishlist button ❤️ on this product "HTC One M8 Android L 5.0 Lollipop"
        And Click on Wishlist Tab
        Then Observe the Qty value and verify it's bigger than 0
