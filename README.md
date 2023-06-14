# SampleNewsApp
APIs Used
Get news feed sample:

https://api.npoint.io/446ca19879714134da9a

Tech Stack & Details
Kotlin
MVVM Clean Architecture
Dagger Hilt for Dependency Injection
Kotlin Coroutines
Kotlin Flows
Room
Navigation Arch Components
Retrofit
Coil for Image Loading
Truth, Mockito for Unit Testing
Communication between layers
UI calls method from ViewModel.
ViewModel executes required Use case.
Use cases gets data from Repository based on internet availability.
Repository can return data from local/remote datasource w/o internet it fetches from local and from remote if internet is present.
If internet is not present or data is not cached user is show a retry screen to Retry.
Information flows back to the UI where we display the results in RecyclerView.
Testing strategy :
Write unit tests for ViewModel.
Write unit tests for UseCases.
Write unit tests for Repository.
Write unit tests for DataSources.
Things that can be improved :
Return cached data in case of API/Server errors.
Notify user that you are seeing cached data please connect to internet if user's internet is not available and results were returned from local data source.
