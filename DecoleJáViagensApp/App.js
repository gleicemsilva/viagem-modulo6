import { NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator } from '@react-navigation/native-stack';
import Home from './screens/Home';
import Destinos from './screens/Destinos';

const Stack = createNativeStackNavigator();

export default function App() {
    return (
      <NavigationContainer>
        <Stack.Navigator initialRouteName="Inicio">
          <Stack.Screen name="Inicio" component={Home} options={{ title: 'Bem vindo(a) ao App da Decole Já Viagens',
          headerStyle: {
            backgroundColor: '#26B3FB',
          },
          headerTintColor: '#fff',
          headerTitleStyle: {
            fontWeight: 'bold',
          }, }} />
          <Stack.Screen name="DestinosList" component={Destinos} options={{ title: 'Destinos disponíveis | Decole Já Viagens',
          headerStyle: {
            backgroundColor: '#26B3FB',
          },
          headerTintColor: '#fff',
          headerTitleStyle: {
            fontWeight: 'bold',
          }, }} />
        </Stack.Navigator>
      </NavigationContainer>
    );

}

