package ai.labs.runtime;

import ai.labs.lifecycle.IConversation;
import ai.labs.lifecycle.LifecycleException;
import ai.labs.memory.IConversationMemory;
import ai.labs.memory.model.Deployment;

/**
 * @author ginccc
 */
public interface IBot {
    String getId();

    Integer getVersion();

    Deployment.Status getDeploymentStatus();

    void addPackage(IExecutablePackage executablePackage) throws IllegalAccessException;

    IConversation startConversation(IConversation.IConversationOutputRenderer outputProvider) throws InstantiationException, IllegalAccessException, LifecycleException;

    IConversation continueConversation(IConversationMemory conversationMemory, IConversation.IConversationOutputRenderer outputProvider) throws InstantiationException, IllegalAccessException;
}
