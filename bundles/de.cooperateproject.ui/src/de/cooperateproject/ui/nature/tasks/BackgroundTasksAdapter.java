package de.cooperateproject.ui.nature.tasks;

import org.eclipse.core.resources.IProject;

import de.cooperateproject.ui.properties.ProjectPropertiesDTO;

public class BackgroundTasksAdapter {

	private static final CooperateProjectBackgroundTaskManager manager = createBackgroundTaskManager();

	private BackgroundTasksAdapter() {

	}

	public static CooperateProjectBackgroundTaskManager getManager() {
		return manager;
	}

	private static CooperateProjectBackgroundTaskManager createBackgroundTaskManager() {
		CooperateProjectBackgroundTaskManager manager = new CooperateProjectBackgroundTaskManager();

		manager.registerTaskFactory(new BackgroundTaskFactory<CDORepositoryAdderTask>() {

			@Override
			public CDORepositoryAdderTask create(IProject project, ProjectPropertiesDTO properties) {
				return new CDORepositoryAdderTask(project, properties);
			}

			@Override
			public Class<CDORepositoryAdderTask> getTaskType() {
				return CDORepositoryAdderTask.class;
			}
		});

		manager.registerTaskFactory(new BackgroundTaskFactory<ModelGenCheckoutTask>() {

			@Override
			public ModelGenCheckoutTask create(IProject project, ProjectPropertiesDTO properties) {
				return new ModelGenCheckoutTask(project, properties);
			}

			@Override
			public Class<ModelGenCheckoutTask> getTaskType() {
				return ModelGenCheckoutTask.class;
			}
		});

		manager.registerTaskFactory(new BackgroundTaskFactory<LauncherFilesCheckoutTask>() {

			@Override
			public LauncherFilesCheckoutTask create(IProject project, ProjectPropertiesDTO properties) {
				return new LauncherFilesCheckoutTask(project, properties);
			}

			@Override
			public Class<LauncherFilesCheckoutTask> getTaskType() {
				return LauncherFilesCheckoutTask.class;
			}
		});
		
		manager.registerTaskFactory(new BackgroundTaskFactory<TransformationBackgroundTask>() {
			@Override
			public TransformationBackgroundTask create(IProject project, ProjectPropertiesDTO properties) {
				return new TransformationBackgroundTask(project, properties);
			}

			@Override
			public Class<TransformationBackgroundTask> getTaskType() {
				return TransformationBackgroundTask.class;
			}
		});

		return manager;
	}

}
