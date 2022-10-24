import 'package:pmovel/shared_pref_helper.dart';

class SharedPrefHelper {
  Future<SharedPreferences> getInstance() async {
    return await SharedPreferences.getInstance();
  }

  login() async {
    SharedPreferences instance = await getInstance();
    instance.setBool('user', true);
  }

  logout() async {
    SharedPreferences instance = await getInstance();
    instance.setBool('user', false);
  }

  Future<bool> getUser() async {
    SharedPreferences instance = await getInstance();
    bool? user = instance.getBool('user');

    if (user == null) {
      return false;
    }

    return user;
  }
}

class SharedPreferences {
  void setBool(String s, bool bool) {}

  static getInstance() {}

  bool? getBool(String s) {}
}
