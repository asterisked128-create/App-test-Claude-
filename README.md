# Aurora — Task 002: Navigation & Module Skeleton

Adds a bottom floating dock with four independent feature modules (Home,
Anime, Manga, Novel), each an empty placeholder screen. Navigation only —
still no content, no business logic, no API endpoints, no real theme.

## Opening the project

1. Open this folder in Android Studio (Ladybird/Koala or newer — needs
   AGP 8.6 / Kotlin 2.0 support).
2. Android Studio will offer to generate the Gradle wrapper jar on first
   sync (this sandbox has no network access to Gradle's distribution
   server, so `gradle/wrapper/gradle-wrapper.jar` isn't included — only
   `gradle-wrapper.properties`, which tells it to fetch Gradle 8.9).
   Alternatively, run `gradle wrapper` once if you have Gradle installed
   locally.
3. Sync. All six modules (`app`, `core:common`, `core:model`,
   `core:database`, `core:network`, `core:designsystem`) should resolve
   and the app should build and launch, showing a plain
   "Aurora — architecture initialised" screen.

## Before your first real build

Rename the placeholder package `io.github.yourusername.aurora` via
Android Studio: right-click the root package → Refactor → Rename →
"Rename package" (updates `namespace`/`applicationId` in the build files
and all directory paths together).

## Module map

| Module | Purpose | Depends on |
|---|---|---|
| `app` | Application/Activity entry point, DI root, NavHost + dock assembly | all `core:*`, all `feature:*` |
| `core:common` | DispatcherProvider, AuroraResult wrapper | — |
| `core:model` | Shared domain models (empty for now) | — |
| `core:database` | Room database (no entities yet) | `core:model` |
| `core:network` | OkHttp/Retrofit/kotlinx.serialization setup (no endpoints yet) | `core:model` |
| `core:designsystem` | Theme/typography/components (empty for now) | — |
| `core:navigation` | `TopLevelDestination`, `AuroraAppState`, `ConnectivityMode` placeholder | — |
| `feature:home` | Home placeholder screen + nav graph entry | `core:navigation` |
| `feature:anime` | Anime placeholder screen + nav graph entry | `core:navigation` |
| `feature:manga` | Manga placeholder screen + nav graph entry | `core:navigation` |
| `feature:novel` | Novel placeholder screen + nav graph entry | `core:navigation` |

## Navigation design (Task 002)

- **`core:navigation`** is the only module every feature depends on for
  navigation. It never depends back on any `:feature:*` module — that's
  what keeps each destination swappable/independent.
- **Route convention**: `TopLevelDestination.HOME.route` (etc.) is a
  plain string that must match each feature's own `HOME_ROUTE` constant.
  This is a deliberate light coupling by convention, not a compile-time
  dependency — see the KDoc on `TopLevelDestination` for the reasoning.
- **`AuroraAppState`** owns the `NavHostController` and implements the
  standard single-top-level-tab pattern (`popUpTo` start + `saveState` +
  `launchSingleTop` + `restoreState`) so switching tabs doesn't stack
  duplicate destinations and preserves scroll/UI state per tab.
- **Online ↔ Offline groundwork**: `ConnectivityMode` (enum) and
  `LocalConnectivityMode` (CompositionLocal, defaults to `ONLINE`) exist
  as a stable seam. Nothing observes real connectivity or switches this
  value yet — that's future work, this task just makes sure no feature
  module will need to change its API when it lands.
- **`AuroraFloatingDock`** (in `:app`) is a plain rounded `Surface` using
  default Material 3 colors — intentionally unstyled per the task spec.
  It gets redesigned once `core:designsystem` has real tokens.

## What's deliberately NOT here

- No Room entities, no Retrofit services, no ViewModels, no real theme,
  no content/business logic in any feature screen — nothing outside this
  task's spec.
- No Provider Layer / Playback Engine / Reader Engine / Download Engine
  logic — those are large future tasks per the architecture doc.
# App-test-Claude-
