/*
 *
 */
package helloworldmvc.model;

import helloworldmvc.contract.IModel;

public class Model implements IModel {
    @Override
    public String getHelloWorld() {
        return ReadText.getInstance().getHelloWorldMessage();
    }

}
