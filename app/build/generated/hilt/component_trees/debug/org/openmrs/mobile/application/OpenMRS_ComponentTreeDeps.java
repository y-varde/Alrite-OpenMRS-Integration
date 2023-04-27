package org.openmrs.mobile.application;

import dagger.hilt.internal.aggregatedroot.codegen._org_openmrs_mobile_application_OpenMRS;
import dagger.hilt.internal.componenttreedeps.ComponentTreeDeps;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ActivityComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ActivityRetainedComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_FragmentComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ServiceComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ViewComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ViewModelComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ViewWithFragmentComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ActivityComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ActivityRetainedComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_FragmentComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ServiceComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ViewComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ViewModelComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ViewWithFragmentComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_components_SingletonComponent;
import hilt_aggregated_deps._androidx_hilt_work_HiltWrapper_WorkerFactoryModule;
import hilt_aggregated_deps._com_openmrs_android_sdk_library_api_workers_UpdatePatientWorker_HiltModule;
import hilt_aggregated_deps._com_openmrs_android_sdk_library_api_workers_allergy_DeleteAllergyWorker_HiltModule;
import hilt_aggregated_deps._com_openmrs_android_sdk_library_api_workers_provider_AddProviderWorker_HiltModule;
import hilt_aggregated_deps._com_openmrs_android_sdk_library_api_workers_provider_DeleteProviderWorker_HiltModule;
import hilt_aggregated_deps._com_openmrs_android_sdk_library_api_workers_provider_UpdateProviderWorker_HiltModule;
import hilt_aggregated_deps._com_openmrs_android_sdk_library_di_entrypoints_RepositoryEntryPoint;
import hilt_aggregated_deps._com_openmrs_android_sdk_library_di_modules_AppDatabaseModule;
import hilt_aggregated_deps._com_openmrs_android_sdk_library_di_modules_ApplicationContextModule;
import hilt_aggregated_deps._com_openmrs_android_sdk_library_di_modules_OpenMRSLoggerModule;
import hilt_aggregated_deps._com_openmrs_android_sdk_library_di_modules_RestServiceModule;
import hilt_aggregated_deps._com_openmrs_android_sdk_library_di_modules_WorkManagerModule;
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_DefaultViewModelFactories_ActivityEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_DefaultViewModelFactories_FragmentEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_HiltViewModelFactory_ViewModelFactoriesEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_HiltWrapper_DefaultViewModelFactories_ActivityModule;
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_HiltWrapper_HiltViewModelFactory_ViewModelModule;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_ActivityComponentManager_ActivityComponentBuilderEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_FragmentComponentManager_FragmentComponentBuilderEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_LifecycleModule;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_ServiceComponentManager_ServiceComponentBuilderEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_ViewComponentManager_ViewComponentBuilderEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_ViewComponentManager_ViewWithFragmentComponentBuilderEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_modules_ApplicationContextModule;
import hilt_aggregated_deps._dagger_hilt_android_internal_modules_HiltWrapper_ActivityModule;
import hilt_aggregated_deps._org_openmrs_mobile_activities_ACBaseActivity_GeneratedInjector;
import hilt_aggregated_deps._org_openmrs_mobile_activities_activevisits_ActiveVisitsActivity_GeneratedInjector;
import hilt_aggregated_deps._org_openmrs_mobile_activities_activevisits_ActiveVisitsFragment_GeneratedInjector;
import hilt_aggregated_deps._org_openmrs_mobile_activities_activevisits_ActiveVisitsViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._org_openmrs_mobile_activities_activevisits_ActiveVisitsViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._org_openmrs_mobile_activities_addeditallergy_AddEditAllergyActivity_GeneratedInjector;
import hilt_aggregated_deps._org_openmrs_mobile_activities_addeditallergy_AddEditAllergyFragment_GeneratedInjector;
import hilt_aggregated_deps._org_openmrs_mobile_activities_addeditallergy_AddEditAllergyViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._org_openmrs_mobile_activities_addeditallergy_AddEditAllergyViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._org_openmrs_mobile_activities_addeditpatient_AddEditPatientActivity_GeneratedInjector;
import hilt_aggregated_deps._org_openmrs_mobile_activities_addeditpatient_AddEditPatientFragment_GeneratedInjector;
import hilt_aggregated_deps._org_openmrs_mobile_activities_addeditpatient_AddEditPatientViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._org_openmrs_mobile_activities_addeditpatient_AddEditPatientViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._org_openmrs_mobile_activities_addeditprovider_AddEditProviderActivity_GeneratedInjector;
import hilt_aggregated_deps._org_openmrs_mobile_activities_addeditprovider_AddEditProviderFragment_GeneratedInjector;
import hilt_aggregated_deps._org_openmrs_mobile_activities_addeditprovider_AddEditProviderViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._org_openmrs_mobile_activities_addeditprovider_AddEditProviderViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._org_openmrs_mobile_activities_community_contact_AboutActivity_GeneratedInjector;
import hilt_aggregated_deps._org_openmrs_mobile_activities_community_contact_ContactUsActivity_GeneratedInjector;
import hilt_aggregated_deps._org_openmrs_mobile_activities_community_contact_ContactUsViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._org_openmrs_mobile_activities_community_contact_ContactUsViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._org_openmrs_mobile_activities_dashboard_DashboardActivity_GeneratedInjector;
import hilt_aggregated_deps._org_openmrs_mobile_activities_dashboard_DashboardFragment_GeneratedInjector;
import hilt_aggregated_deps._org_openmrs_mobile_activities_dashboard_DashboardViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._org_openmrs_mobile_activities_dashboard_DashboardViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._org_openmrs_mobile_activities_formadmission_FormAdmissionActivity_GeneratedInjector;
import hilt_aggregated_deps._org_openmrs_mobile_activities_formadmission_FormAdmissionFragment_GeneratedInjector;
import hilt_aggregated_deps._org_openmrs_mobile_activities_formadmission_FormAdmissionViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._org_openmrs_mobile_activities_formadmission_FormAdmissionViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._org_openmrs_mobile_activities_formdisplay_FormDisplayActivity_GeneratedInjector;
import hilt_aggregated_deps._org_openmrs_mobile_activities_formdisplay_FormDisplayMainViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._org_openmrs_mobile_activities_formdisplay_FormDisplayMainViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._org_openmrs_mobile_activities_formdisplay_FormDisplayPageFragment_GeneratedInjector;
import hilt_aggregated_deps._org_openmrs_mobile_activities_formdisplay_FormDisplayPageViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._org_openmrs_mobile_activities_formdisplay_FormDisplayPageViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._org_openmrs_mobile_activities_formentrypatientlist_FormEntryPatientListActivity_GeneratedInjector;
import hilt_aggregated_deps._org_openmrs_mobile_activities_formentrypatientlist_FormEntryPatientListFragment_GeneratedInjector;
import hilt_aggregated_deps._org_openmrs_mobile_activities_formentrypatientlist_FormEntryPatientListViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._org_openmrs_mobile_activities_formentrypatientlist_FormEntryPatientListViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._org_openmrs_mobile_activities_formlist_FormListActivity_GeneratedInjector;
import hilt_aggregated_deps._org_openmrs_mobile_activities_formlist_FormListFragment_GeneratedInjector;
import hilt_aggregated_deps._org_openmrs_mobile_activities_formlist_FormListViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._org_openmrs_mobile_activities_formlist_FormListViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._org_openmrs_mobile_activities_lastviewedpatients_LastViewedPatientsActivity_GeneratedInjector;
import hilt_aggregated_deps._org_openmrs_mobile_activities_lastviewedpatients_LastViewedPatientsFragment_GeneratedInjector;
import hilt_aggregated_deps._org_openmrs_mobile_activities_lastviewedpatients_LastViewedPatientsViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._org_openmrs_mobile_activities_lastviewedpatients_LastViewedPatientsViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._org_openmrs_mobile_activities_login_LoginActivity_GeneratedInjector;
import hilt_aggregated_deps._org_openmrs_mobile_activities_login_LoginFragment_GeneratedInjector;
import hilt_aggregated_deps._org_openmrs_mobile_activities_login_LoginViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._org_openmrs_mobile_activities_login_LoginViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._org_openmrs_mobile_activities_logs_LogsActivity_GeneratedInjector;
import hilt_aggregated_deps._org_openmrs_mobile_activities_logs_LogsFragment_GeneratedInjector;
import hilt_aggregated_deps._org_openmrs_mobile_activities_logs_LogsViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._org_openmrs_mobile_activities_logs_LogsViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._org_openmrs_mobile_activities_matchingpatients_MatchingPatientsActivity_GeneratedInjector;
import hilt_aggregated_deps._org_openmrs_mobile_activities_matchingpatients_MatchingPatientsFragment_GeneratedInjector;
import hilt_aggregated_deps._org_openmrs_mobile_activities_matchingpatients_MatchingPatientsViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._org_openmrs_mobile_activities_matchingpatients_MatchingPatientsViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._org_openmrs_mobile_activities_patientdashboard_PatientDashboardActivity_GeneratedInjector;
import hilt_aggregated_deps._org_openmrs_mobile_activities_patientdashboard_PatientDashboardMainViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._org_openmrs_mobile_activities_patientdashboard_PatientDashboardMainViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._org_openmrs_mobile_activities_patientdashboard_allergy_PatientAllergyFragment_GeneratedInjector;
import hilt_aggregated_deps._org_openmrs_mobile_activities_patientdashboard_allergy_PatientDashboardAllergyViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._org_openmrs_mobile_activities_patientdashboard_allergy_PatientDashboardAllergyViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._org_openmrs_mobile_activities_patientdashboard_charts_PatientChartsFragment_GeneratedInjector;
import hilt_aggregated_deps._org_openmrs_mobile_activities_patientdashboard_charts_PatientDashboardChartsViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._org_openmrs_mobile_activities_patientdashboard_charts_PatientDashboardChartsViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._org_openmrs_mobile_activities_patientdashboard_details_PatientDashboardDetailsViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._org_openmrs_mobile_activities_patientdashboard_details_PatientDashboardDetailsViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._org_openmrs_mobile_activities_patientdashboard_details_PatientDetailsFragment_GeneratedInjector;
import hilt_aggregated_deps._org_openmrs_mobile_activities_patientdashboard_diagnosis_PatientDashboardDiagnosisViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._org_openmrs_mobile_activities_patientdashboard_diagnosis_PatientDashboardDiagnosisViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._org_openmrs_mobile_activities_patientdashboard_diagnosis_PatientDiagnosisFragment_GeneratedInjector;
import hilt_aggregated_deps._org_openmrs_mobile_activities_patientdashboard_visits_PatientDashboardVisitsViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._org_openmrs_mobile_activities_patientdashboard_visits_PatientDashboardVisitsViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._org_openmrs_mobile_activities_patientdashboard_visits_PatientVisitsFragment_GeneratedInjector;
import hilt_aggregated_deps._org_openmrs_mobile_activities_patientdashboard_vitals_PatientDashboardVitalsViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._org_openmrs_mobile_activities_patientdashboard_vitals_PatientDashboardVitalsViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._org_openmrs_mobile_activities_patientdashboard_vitals_PatientVitalsFragment_GeneratedInjector;
import hilt_aggregated_deps._org_openmrs_mobile_activities_providerdashboard_ProviderDashboardActivity_GeneratedInjector;
import hilt_aggregated_deps._org_openmrs_mobile_activities_providerdashboard_ProviderDashboardViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._org_openmrs_mobile_activities_providerdashboard_ProviderDashboardViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._org_openmrs_mobile_activities_providerdashboard_patientrelationship_PatientRelationshipFragment_GeneratedInjector;
import hilt_aggregated_deps._org_openmrs_mobile_activities_providerdashboard_providerrelationship_ProviderRelationshipFragment_GeneratedInjector;
import hilt_aggregated_deps._org_openmrs_mobile_activities_providermanagerdashboard_ProviderManagerDashboardActivity_GeneratedInjector;
import hilt_aggregated_deps._org_openmrs_mobile_activities_providermanagerdashboard_ProviderManagerDashboardFragment_GeneratedInjector;
import hilt_aggregated_deps._org_openmrs_mobile_activities_providermanagerdashboard_ProviderManagerDashboardViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._org_openmrs_mobile_activities_providermanagerdashboard_ProviderManagerDashboardViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._org_openmrs_mobile_activities_settings_SettingsActivity_GeneratedInjector;
import hilt_aggregated_deps._org_openmrs_mobile_activities_settings_SettingsFragment_GeneratedInjector;
import hilt_aggregated_deps._org_openmrs_mobile_activities_settings_SettingsViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._org_openmrs_mobile_activities_settings_SettingsViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._org_openmrs_mobile_activities_syncedpatients_SyncedPatientsActivity_GeneratedInjector;
import hilt_aggregated_deps._org_openmrs_mobile_activities_syncedpatients_SyncedPatientsFragment_GeneratedInjector;
import hilt_aggregated_deps._org_openmrs_mobile_activities_syncedpatients_SyncedPatientsViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._org_openmrs_mobile_activities_syncedpatients_SyncedPatientsViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._org_openmrs_mobile_activities_visitdashboard_VisitDashboardActivity_GeneratedInjector;
import hilt_aggregated_deps._org_openmrs_mobile_activities_visitdashboard_VisitDashboardFragment_GeneratedInjector;
import hilt_aggregated_deps._org_openmrs_mobile_activities_visitdashboard_VisitDashboardViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._org_openmrs_mobile_activities_visitdashboard_VisitDashboardViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._org_openmrs_mobile_application_OpenMRS_GeneratedInjector;
import hilt_aggregated_deps._org_openmrs_mobile_services_ConceptDownloadService_GeneratedInjector;
import hilt_aggregated_deps._org_openmrs_mobile_services_EncounterService_GeneratedInjector;
import hilt_aggregated_deps._org_openmrs_mobile_services_FormListService_GeneratedInjector;
import hilt_aggregated_deps._org_openmrs_mobile_services_PatientService_GeneratedInjector;

@ComponentTreeDeps(
    rootDeps = _org_openmrs_mobile_application_OpenMRS.class,
    defineComponentDeps = {
        _dagger_hilt_android_components_ActivityComponent.class,
        _dagger_hilt_android_components_ActivityRetainedComponent.class,
        _dagger_hilt_android_components_FragmentComponent.class,
        _dagger_hilt_android_components_ServiceComponent.class,
        _dagger_hilt_android_components_ViewComponent.class,
        _dagger_hilt_android_components_ViewModelComponent.class,
        _dagger_hilt_android_components_ViewWithFragmentComponent.class,
        _dagger_hilt_android_internal_builders_ActivityComponentBuilder.class,
        _dagger_hilt_android_internal_builders_ActivityRetainedComponentBuilder.class,
        _dagger_hilt_android_internal_builders_FragmentComponentBuilder.class,
        _dagger_hilt_android_internal_builders_ServiceComponentBuilder.class,
        _dagger_hilt_android_internal_builders_ViewComponentBuilder.class,
        _dagger_hilt_android_internal_builders_ViewModelComponentBuilder.class,
        _dagger_hilt_android_internal_builders_ViewWithFragmentComponentBuilder.class,
        _dagger_hilt_components_SingletonComponent.class
    },
    aggregatedDeps = {
        _androidx_hilt_work_HiltWrapper_WorkerFactoryModule.class,
        _com_openmrs_android_sdk_library_api_workers_UpdatePatientWorker_HiltModule.class,
        _com_openmrs_android_sdk_library_api_workers_allergy_DeleteAllergyWorker_HiltModule.class,
        _com_openmrs_android_sdk_library_api_workers_provider_AddProviderWorker_HiltModule.class,
        _com_openmrs_android_sdk_library_api_workers_provider_DeleteProviderWorker_HiltModule.class,
        _com_openmrs_android_sdk_library_api_workers_provider_UpdateProviderWorker_HiltModule.class,
        _com_openmrs_android_sdk_library_di_entrypoints_RepositoryEntryPoint.class,
        _com_openmrs_android_sdk_library_di_modules_AppDatabaseModule.class,
        _com_openmrs_android_sdk_library_di_modules_ApplicationContextModule.class,
        _com_openmrs_android_sdk_library_di_modules_OpenMRSLoggerModule.class,
        _com_openmrs_android_sdk_library_di_modules_RestServiceModule.class,
        _com_openmrs_android_sdk_library_di_modules_WorkManagerModule.class,
        _dagger_hilt_android_internal_lifecycle_DefaultViewModelFactories_ActivityEntryPoint.class,
        _dagger_hilt_android_internal_lifecycle_DefaultViewModelFactories_FragmentEntryPoint.class,
        _dagger_hilt_android_internal_lifecycle_HiltViewModelFactory_ViewModelFactoriesEntryPoint.class,
        _dagger_hilt_android_internal_lifecycle_HiltWrapper_DefaultViewModelFactories_ActivityModule.class,
        _dagger_hilt_android_internal_lifecycle_HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint.class,
        _dagger_hilt_android_internal_lifecycle_HiltWrapper_HiltViewModelFactory_ViewModelModule.class,
        _dagger_hilt_android_internal_managers_ActivityComponentManager_ActivityComponentBuilderEntryPoint.class,
        _dagger_hilt_android_internal_managers_FragmentComponentManager_FragmentComponentBuilderEntryPoint.class,
        _dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint.class,
        _dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint.class,
        _dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_LifecycleModule.class,
        _dagger_hilt_android_internal_managers_ServiceComponentManager_ServiceComponentBuilderEntryPoint.class,
        _dagger_hilt_android_internal_managers_ViewComponentManager_ViewComponentBuilderEntryPoint.class,
        _dagger_hilt_android_internal_managers_ViewComponentManager_ViewWithFragmentComponentBuilderEntryPoint.class,
        _dagger_hilt_android_internal_modules_ApplicationContextModule.class,
        _dagger_hilt_android_internal_modules_HiltWrapper_ActivityModule.class,
        _org_openmrs_mobile_activities_ACBaseActivity_GeneratedInjector.class,
        _org_openmrs_mobile_activities_activevisits_ActiveVisitsActivity_GeneratedInjector.class,
        _org_openmrs_mobile_activities_activevisits_ActiveVisitsFragment_GeneratedInjector.class,
        _org_openmrs_mobile_activities_activevisits_ActiveVisitsViewModel_HiltModules_BindsModule.class,
        _org_openmrs_mobile_activities_activevisits_ActiveVisitsViewModel_HiltModules_KeyModule.class,
        _org_openmrs_mobile_activities_addeditallergy_AddEditAllergyActivity_GeneratedInjector.class,
        _org_openmrs_mobile_activities_addeditallergy_AddEditAllergyFragment_GeneratedInjector.class,
        _org_openmrs_mobile_activities_addeditallergy_AddEditAllergyViewModel_HiltModules_BindsModule.class,
        _org_openmrs_mobile_activities_addeditallergy_AddEditAllergyViewModel_HiltModules_KeyModule.class,
        _org_openmrs_mobile_activities_addeditpatient_AddEditPatientActivity_GeneratedInjector.class,
        _org_openmrs_mobile_activities_addeditpatient_AddEditPatientFragment_GeneratedInjector.class,
        _org_openmrs_mobile_activities_addeditpatient_AddEditPatientViewModel_HiltModules_BindsModule.class,
        _org_openmrs_mobile_activities_addeditpatient_AddEditPatientViewModel_HiltModules_KeyModule.class,
        _org_openmrs_mobile_activities_addeditprovider_AddEditProviderActivity_GeneratedInjector.class,
        _org_openmrs_mobile_activities_addeditprovider_AddEditProviderFragment_GeneratedInjector.class,
        _org_openmrs_mobile_activities_addeditprovider_AddEditProviderViewModel_HiltModules_BindsModule.class,
        _org_openmrs_mobile_activities_addeditprovider_AddEditProviderViewModel_HiltModules_KeyModule.class,
        _org_openmrs_mobile_activities_community_contact_AboutActivity_GeneratedInjector.class,
        _org_openmrs_mobile_activities_community_contact_ContactUsActivity_GeneratedInjector.class,
        _org_openmrs_mobile_activities_community_contact_ContactUsViewModel_HiltModules_BindsModule.class,
        _org_openmrs_mobile_activities_community_contact_ContactUsViewModel_HiltModules_KeyModule.class,
        _org_openmrs_mobile_activities_dashboard_DashboardActivity_GeneratedInjector.class,
        _org_openmrs_mobile_activities_dashboard_DashboardFragment_GeneratedInjector.class,
        _org_openmrs_mobile_activities_dashboard_DashboardViewModel_HiltModules_BindsModule.class,
        _org_openmrs_mobile_activities_dashboard_DashboardViewModel_HiltModules_KeyModule.class,
        _org_openmrs_mobile_activities_formadmission_FormAdmissionActivity_GeneratedInjector.class,
        _org_openmrs_mobile_activities_formadmission_FormAdmissionFragment_GeneratedInjector.class,
        _org_openmrs_mobile_activities_formadmission_FormAdmissionViewModel_HiltModules_BindsModule.class,
        _org_openmrs_mobile_activities_formadmission_FormAdmissionViewModel_HiltModules_KeyModule.class,
        _org_openmrs_mobile_activities_formdisplay_FormDisplayActivity_GeneratedInjector.class,
        _org_openmrs_mobile_activities_formdisplay_FormDisplayMainViewModel_HiltModules_BindsModule.class,
        _org_openmrs_mobile_activities_formdisplay_FormDisplayMainViewModel_HiltModules_KeyModule.class,
        _org_openmrs_mobile_activities_formdisplay_FormDisplayPageFragment_GeneratedInjector.class,
        _org_openmrs_mobile_activities_formdisplay_FormDisplayPageViewModel_HiltModules_BindsModule.class,
        _org_openmrs_mobile_activities_formdisplay_FormDisplayPageViewModel_HiltModules_KeyModule.class,
        _org_openmrs_mobile_activities_formentrypatientlist_FormEntryPatientListActivity_GeneratedInjector.class,
        _org_openmrs_mobile_activities_formentrypatientlist_FormEntryPatientListFragment_GeneratedInjector.class,
        _org_openmrs_mobile_activities_formentrypatientlist_FormEntryPatientListViewModel_HiltModules_BindsModule.class,
        _org_openmrs_mobile_activities_formentrypatientlist_FormEntryPatientListViewModel_HiltModules_KeyModule.class,
        _org_openmrs_mobile_activities_formlist_FormListActivity_GeneratedInjector.class,
        _org_openmrs_mobile_activities_formlist_FormListFragment_GeneratedInjector.class,
        _org_openmrs_mobile_activities_formlist_FormListViewModel_HiltModules_BindsModule.class,
        _org_openmrs_mobile_activities_formlist_FormListViewModel_HiltModules_KeyModule.class,
        _org_openmrs_mobile_activities_lastviewedpatients_LastViewedPatientsActivity_GeneratedInjector.class,
        _org_openmrs_mobile_activities_lastviewedpatients_LastViewedPatientsFragment_GeneratedInjector.class,
        _org_openmrs_mobile_activities_lastviewedpatients_LastViewedPatientsViewModel_HiltModules_BindsModule.class,
        _org_openmrs_mobile_activities_lastviewedpatients_LastViewedPatientsViewModel_HiltModules_KeyModule.class,
        _org_openmrs_mobile_activities_login_LoginActivity_GeneratedInjector.class,
        _org_openmrs_mobile_activities_login_LoginFragment_GeneratedInjector.class,
        _org_openmrs_mobile_activities_login_LoginViewModel_HiltModules_BindsModule.class,
        _org_openmrs_mobile_activities_login_LoginViewModel_HiltModules_KeyModule.class,
        _org_openmrs_mobile_activities_logs_LogsActivity_GeneratedInjector.class,
        _org_openmrs_mobile_activities_logs_LogsFragment_GeneratedInjector.class,
        _org_openmrs_mobile_activities_logs_LogsViewModel_HiltModules_BindsModule.class,
        _org_openmrs_mobile_activities_logs_LogsViewModel_HiltModules_KeyModule.class,
        _org_openmrs_mobile_activities_matchingpatients_MatchingPatientsActivity_GeneratedInjector.class,
        _org_openmrs_mobile_activities_matchingpatients_MatchingPatientsFragment_GeneratedInjector.class,
        _org_openmrs_mobile_activities_matchingpatients_MatchingPatientsViewModel_HiltModules_BindsModule.class,
        _org_openmrs_mobile_activities_matchingpatients_MatchingPatientsViewModel_HiltModules_KeyModule.class,
        _org_openmrs_mobile_activities_patientdashboard_PatientDashboardActivity_GeneratedInjector.class,
        _org_openmrs_mobile_activities_patientdashboard_PatientDashboardMainViewModel_HiltModules_BindsModule.class,
        _org_openmrs_mobile_activities_patientdashboard_PatientDashboardMainViewModel_HiltModules_KeyModule.class,
        _org_openmrs_mobile_activities_patientdashboard_allergy_PatientAllergyFragment_GeneratedInjector.class,
        _org_openmrs_mobile_activities_patientdashboard_allergy_PatientDashboardAllergyViewModel_HiltModules_BindsModule.class,
        _org_openmrs_mobile_activities_patientdashboard_allergy_PatientDashboardAllergyViewModel_HiltModules_KeyModule.class,
        _org_openmrs_mobile_activities_patientdashboard_charts_PatientChartsFragment_GeneratedInjector.class,
        _org_openmrs_mobile_activities_patientdashboard_charts_PatientDashboardChartsViewModel_HiltModules_BindsModule.class,
        _org_openmrs_mobile_activities_patientdashboard_charts_PatientDashboardChartsViewModel_HiltModules_KeyModule.class,
        _org_openmrs_mobile_activities_patientdashboard_details_PatientDashboardDetailsViewModel_HiltModules_BindsModule.class,
        _org_openmrs_mobile_activities_patientdashboard_details_PatientDashboardDetailsViewModel_HiltModules_KeyModule.class,
        _org_openmrs_mobile_activities_patientdashboard_details_PatientDetailsFragment_GeneratedInjector.class,
        _org_openmrs_mobile_activities_patientdashboard_diagnosis_PatientDashboardDiagnosisViewModel_HiltModules_BindsModule.class,
        _org_openmrs_mobile_activities_patientdashboard_diagnosis_PatientDashboardDiagnosisViewModel_HiltModules_KeyModule.class,
        _org_openmrs_mobile_activities_patientdashboard_diagnosis_PatientDiagnosisFragment_GeneratedInjector.class,
        _org_openmrs_mobile_activities_patientdashboard_visits_PatientDashboardVisitsViewModel_HiltModules_BindsModule.class,
        _org_openmrs_mobile_activities_patientdashboard_visits_PatientDashboardVisitsViewModel_HiltModules_KeyModule.class,
        _org_openmrs_mobile_activities_patientdashboard_visits_PatientVisitsFragment_GeneratedInjector.class,
        _org_openmrs_mobile_activities_patientdashboard_vitals_PatientDashboardVitalsViewModel_HiltModules_BindsModule.class,
        _org_openmrs_mobile_activities_patientdashboard_vitals_PatientDashboardVitalsViewModel_HiltModules_KeyModule.class,
        _org_openmrs_mobile_activities_patientdashboard_vitals_PatientVitalsFragment_GeneratedInjector.class,
        _org_openmrs_mobile_activities_providerdashboard_ProviderDashboardActivity_GeneratedInjector.class,
        _org_openmrs_mobile_activities_providerdashboard_ProviderDashboardViewModel_HiltModules_BindsModule.class,
        _org_openmrs_mobile_activities_providerdashboard_ProviderDashboardViewModel_HiltModules_KeyModule.class,
        _org_openmrs_mobile_activities_providerdashboard_patientrelationship_PatientRelationshipFragment_GeneratedInjector.class,
        _org_openmrs_mobile_activities_providerdashboard_providerrelationship_ProviderRelationshipFragment_GeneratedInjector.class,
        _org_openmrs_mobile_activities_providermanagerdashboard_ProviderManagerDashboardActivity_GeneratedInjector.class,
        _org_openmrs_mobile_activities_providermanagerdashboard_ProviderManagerDashboardFragment_GeneratedInjector.class,
        _org_openmrs_mobile_activities_providermanagerdashboard_ProviderManagerDashboardViewModel_HiltModules_BindsModule.class,
        _org_openmrs_mobile_activities_providermanagerdashboard_ProviderManagerDashboardViewModel_HiltModules_KeyModule.class,
        _org_openmrs_mobile_activities_settings_SettingsActivity_GeneratedInjector.class,
        _org_openmrs_mobile_activities_settings_SettingsFragment_GeneratedInjector.class,
        _org_openmrs_mobile_activities_settings_SettingsViewModel_HiltModules_BindsModule.class,
        _org_openmrs_mobile_activities_settings_SettingsViewModel_HiltModules_KeyModule.class,
        _org_openmrs_mobile_activities_syncedpatients_SyncedPatientsActivity_GeneratedInjector.class,
        _org_openmrs_mobile_activities_syncedpatients_SyncedPatientsFragment_GeneratedInjector.class,
        _org_openmrs_mobile_activities_syncedpatients_SyncedPatientsViewModel_HiltModules_BindsModule.class,
        _org_openmrs_mobile_activities_syncedpatients_SyncedPatientsViewModel_HiltModules_KeyModule.class,
        _org_openmrs_mobile_activities_visitdashboard_VisitDashboardActivity_GeneratedInjector.class,
        _org_openmrs_mobile_activities_visitdashboard_VisitDashboardFragment_GeneratedInjector.class,
        _org_openmrs_mobile_activities_visitdashboard_VisitDashboardViewModel_HiltModules_BindsModule.class,
        _org_openmrs_mobile_activities_visitdashboard_VisitDashboardViewModel_HiltModules_KeyModule.class,
        _org_openmrs_mobile_application_OpenMRS_GeneratedInjector.class,
        _org_openmrs_mobile_services_ConceptDownloadService_GeneratedInjector.class,
        _org_openmrs_mobile_services_EncounterService_GeneratedInjector.class,
        _org_openmrs_mobile_services_FormListService_GeneratedInjector.class,
        _org_openmrs_mobile_services_PatientService_GeneratedInjector.class
    }
)
public final class OpenMRS_ComponentTreeDeps {
}
