# Calculator — Lab14 (Maven + Git Workflow + GitHub Actions)

Энэ бол Maven-д суурилсан энгийн Java төслийг ашиглан **Git workflow** (feature/develop/release/hotfix),
мөн **GitHub Actions**-аар JUnit тест, Checkstyle, JaCoCo (100% branch coverage) хэрэгжүүлэх лаборатори.

## ✅ Ашиглах командууд

```bash
# Тестүүд ажиллуулах
mvn test

# Checkstyle дүрмийг шалгах
mvn checkstyle:check

# Coverage тайлан үүсгэх (HTML: target/site/jacoco/index.html)
mvn jacoco:report

# Coverage 100% шалгах (CI-д ашиглагдана)
mvn jacoco:check
```

## 🔀 Салбарын урсгал

- `main` — хамгаалалттай (PR-only merge)
- `develop` — өдөр тутмын интеграц
- `feature/*` — онцлог хөгжүүлэлт
- `release/*` — хувилбар бэлдэх
- `hotfix/*` — яаралтай засвар

## 🛠️ CI (GitHub Actions)

`.github/workflows/ci.yml` workflow нь `develop` болон `release/*` салбарууд дээр:
- `mvn checkstyle:check`
- `mvn test jacoco:check`
- `mvn jacoco:report`

## 📦 Төслийн бүтэц

```
calculator/
├─ .github/workflows/ci.yml
├─ pom.xml
├─ checkstyle.xml
├─ README.md
├─ src
│  ├─ main/java/lab14/sict/must/edu/mn
│  │  ├─ Multiplication.java
│  │  └─ Division.java
│  └─ test/java/lab14/sict/must/edu/mn
│     ├─ MultiplicationTest.java
│     └─ DivisionTest.java
└─ conflict_resolution.md
```

## 🧪 Coverage 100% Жич

`Division#divide` нь тэгээр хуваах нөхцөлтэй `if` агуулдаг тул **branch coverage**-ийг 100% болгохын тулд:
- хэвийн хуваах (if=false),
- тэгээр хуваах (if=true, exception) — хоёуланг тестэлнэ.

## 🔒 Main branch protection

GitHub → **Settings → Branches → Add rule**:
- ✔ Require a pull request before merging
- ✔ Require status checks to pass before merging (CI Процесс)
- ✔ Require branches to be up to date before merging
- ✔ Do not allow bypassing the above settings
```

