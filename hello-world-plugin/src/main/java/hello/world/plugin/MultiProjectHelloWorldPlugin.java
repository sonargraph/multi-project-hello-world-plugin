package hello.world.plugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

import hello.world.dependency.Library;

public class MultiProjectHelloWorldPlugin implements Plugin<Project>
{
    @Override
    public void apply(final Project project)
    {
        final String message = new Library().someLibraryMethod();
        System.out.println(message);
    }
}
