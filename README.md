# android-7.1.1-lifecycle-bug

**Nexus 5X (7.1.1 and 7.1.2)**
1. onActivityPaused: MainActivity
2. onActivityCreated: NavigationActivity
3. startActivity: NavigationActivity
4. finish: NavigationActivity
5. onNewIntent: MainActivity
6. onActivityResumed: MainActivity
7. onActivityPaused: MainActivity
8. onActivityResumed: MainActivity
9. onActivityDestroyed: NavigationActivity

**Emulator API 25**
1. onActivityPaused: MainActivity
2. onActivityCreated: NavigationActivity
3. startActivity: NavigationActivity
4. finish: NavigationActivity
5. onNewIntent: MainActivity
6. onActivityResumed: MainActivity
7. onActivityPaused: MainActivity
8. onActivityResumed: MainActivity
9. onActivityDestroyed: NavigationActivity

---

**HTC One S (4.1.1)**
1. onActivityPaused: MainActivity
2. onActivityCreated: NavigationActivity
3. startActivity: NavigationActivity
4. finish: NavigationActivity
5. onNewIntent: MainActivity
6. onActivityResumed: MainActivity
7. onActivityDestroyed: NavigationActivity

**Emulator API 23**
1. onActivityPaused: MainActivity
2. onActivityCreated: NavigationActivity
3. startActivity: NavigationActivity
4. finish: NavigationActivity
5. onNewIntent: MainActivity
6. onActivityResumed: MainActivity
7. onActivityDestroyed: NavigationActivity
