Feature: SignedIn at SwagLabs

  @SuccessfullySigned
  Scenario: SignedIn Successfully
    When that Juan signed-in SwagLabs app
    Then he can see the available products

  @ErrorSigned
  Scenario: SignedIn Error
    When that Juan2 try signed-in with error data
    Then he can see the message error